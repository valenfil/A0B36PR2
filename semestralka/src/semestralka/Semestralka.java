/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

/**
 *
 * @author Filip
 */
public class Semestralka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean validInput = true;
        int numpass = new Integer(args[0]).intValue();
        int numstops = new Integer(args[1]).intValue();
        int interval = new Integer(args[2]).intValue();
        int mode = new Integer(args[3]).intValue();
        int runTimes = 0;
        boolean demoMode = false;
        if (numpass < 1 || numstops < 2 || interval < 1 || mode != 1 && mode != 2) {
            validInput = false;

        }
    }
}
