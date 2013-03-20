/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol1;

/**
 *
 * @author Filip
 */
public class BinOp extends Expr {
    char operation;
    Expr firstOperand;
    Expr secondOperand;
    
    public BinOp(char operation, Expr first, Expr second) {
        this.operation = operation;
        this.firstOperand = first;
        this.secondOperand = second;
    }
    
    @Override
    public double evaluate() {
        switch (operation) {
            case '+':
                return firstOperand.evaluate() + secondOperand.evaluate();
            case '-':
                return firstOperand.evaluate() - secondOperand.evaluate();
            case '*':
                return firstOperand.evaluate() * secondOperand.evaluate();
            default: // divison
                return firstOperand.evaluate() / secondOperand.evaluate();
        }
    }
    
    @Override
    public Expr simplify() {
        if(operation == '+' || operation == '-') {
            
            if(firstOperand instanceof Constant || secondOperand instanceof Constant) {
                if(firstOperand instanceof Constant && firstOperand.evaluate() == 0) {
                    if(operation == '-') {
                        return ((Constant) secondOperand).neg().simplify();
                    }                    
                    return secondOperand.simplify();
                } else if(secondOperand instanceof Constant && secondOperand.evaluate() == 0) {
                    return firstOperand.simplify();
                }                                
            } 
            // end of + -
        } else if(operation == '*') {
                        
            if(firstOperand instanceof Constant || secondOperand instanceof Constant) {
                
                // 0 * whatever or whatever * 0
                if((firstOperand instanceof Constant && firstOperand.evaluate() == 0) ||
                    (secondOperand instanceof Constant && secondOperand.evaluate() == 0)) {
                    return new Constant(0);
                }
                
                // 1 * whatever or whatever * 1
                if(firstOperand instanceof Constant && firstOperand.evaluate() == 1) {
                    return secondOperand.simplify();
                } else if(secondOperand instanceof Constant && secondOperand.evaluate() == 1) {
                    return firstOperand.simplify();
                }                
                
            }
            
            // end of *
        } else { // divison
            
            if(firstOperand instanceof Constant && firstOperand.evaluate() == 0) {
                return new Constant(0);
            } else if(secondOperand instanceof Constant && secondOperand.evaluate() == 1) {
                return firstOperand.simplify();
            } else if (secondOperand instanceof Constant && secondOperand.evaluate() == 0) {
                // FATAL MEGA ERROR!!!!
            }
            
            // end of division
        }
        
        BinOp e = new BinOp(operation, firstOperand.simplify(), secondOperand.simplify());
        if(e.hasNeutralOperand() == true) {
            return e.simplify();
        }
        
        return (Expr) e;
    }
    
    public boolean hasNeutralOperand() {
        return this.isNeutral(firstOperand, true) || this.isNeutral(firstOperand, false);
    }
    
    private boolean isNeutral(Expr operand, boolean isFirst) {
        switch (operation) {
            case '+':
            case '-':
                return operand instanceof Constant && operand.evaluate() == 0;
                
            case '*':
                return operand instanceof Constant && (operand.evaluate() == 0 || operand.evaluate() == 1);                    
            default:
                return operand instanceof Constant && 
                                    ((operand.evaluate() == 0 && isFirst) 
                                    || (operand.evaluate() == 1 && !isFirst));
                                                                
        }
    }
    
    @Override
    public Expr derive(char var) {
        switch (operation) {
            case '+':
            case '-':
                return new BinOp(operation, firstOperand.derive(var), secondOperand.derive(var));
           
            case '*':
                return new BinOp('+', 
                                    new BinOp('*', firstOperand.derive(var), secondOperand),
                                    new BinOp('*', firstOperand, secondOperand.derive(var)));
            default: // division
                return new BinOp('/', new BinOp('-', 
                                        new BinOp('*', firstOperand.derive(var), secondOperand),
                                        new BinOp('*', firstOperand, secondOperand.derive(var))),
                                    new BinOp('*', secondOperand, secondOperand));
             
        }
    }
    
    @Override
    public String toString() {
        return "(" + firstOperand + " " + operation + " " + secondOperand + ")";
    }
}
