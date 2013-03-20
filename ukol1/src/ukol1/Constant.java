/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol1;

import java.text.DecimalFormat;

/**
 *
 * @author Filip
 */
public class Constant extends Expr{
    double value;
    
    public Constant(double value) {
        this.value = value;
    }
    
    public Expr neg() {
        return new Constant(value * (-1));
    }
    
    @Override
    public double evaluate() {
        return value;
    }
    
    @Override
    public Expr derive(char var) {
        return new Constant(0);
    }
    
    @Override
    public Expr simplify() {
        return this;
    }
    
    @Override
    public String toString() {
        DecimalFormat three = new DecimalFormat("0.000");
        return three.format(value);
    }
}
