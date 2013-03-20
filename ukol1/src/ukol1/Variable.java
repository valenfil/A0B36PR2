/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol1;

/**
 *
 * @author Filip
 */
public class Variable extends Expr {
    char name;
    double value;
    
    public Variable(char name, double value) {
        this.name = name;
        this.value = value;
    }
    
    // evaluate -> returns value
    @Override
    public double evaluate() {
        return value;
    }
    
    @Override
    public Expr simplify() {
        return this;
    }
    
    @Override
    public Expr derive(char var) {
        if(this.name == var) {
            return new Constant(1);
        } else {
            return new Constant(0);
        }
    }
    
    @Override
    public String toString() {
        return Character.toString(name);
    }
}
