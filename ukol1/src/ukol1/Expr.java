/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol1;

/**
 * @param args the command line arguments
 */
public abstract class Expr {

   abstract double evaluate();

   abstract Expr derive(char var);

   abstract Expr simplify();
}

