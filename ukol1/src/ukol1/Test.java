/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol1;

/**
 *
 * @author Filip
 */
public class Test {
    
    public static void main(String[] args) {
        
        Expr x = new Variable('x', 5);
        Expr five = new Constant(1);
        Expr inside = new BinOp('/', five, new Variable('y', 3));
        Expr operation = new BinOp('*', inside, x);
        
        System.out.println("x: " + x);
        System.out.println("x.eval: " + x.evaluate());
        System.out.println("x.derive(x): " + x.derive('x').toString());
        System.out.println("x.derive(y): " + x.derive('y').toString());
        
        System.out.println("5: " + five);
        System.out.println("5.eval: " + five.evaluate());
        System.out.println("5.derive(x): " + five.derive('x'));
        
        System.out.println("op: " + operation);
        System.out.println("op.eval: " + operation.evaluate());
        System.out.println("op.derive(x): " + operation.derive('x'));
        System.out.println("op.derive(x).simplify: " + operation.derive('x').simplify());
        System.out.println("op.simplify: " + operation.simplify());
        
        
    }
    
}
