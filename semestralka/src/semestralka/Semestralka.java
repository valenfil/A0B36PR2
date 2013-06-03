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
        new Grafika();
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
        for (int q = 0; q < runTimes; q++) {
            int numBusses = (int) (1440 / interval);
            int[] busses = new int[numBusses];
            double totalWaitTime = 0.0;


            for (int i = 0; i < busses.length; i++) {
                busses[i] = i * interval;
                if (demoMode) {
                    String str = "Bus " + (i + 1) + " leaves at ";
                    if (busses[i] / 60 < 10) {
                        str += "0" + (busses[i] / 60);
                    } else {
                        str += (busses[i] / 60);
                    }
                    if (busses[i] % 60 < 10) {
                        str += ":0" + (busses[i] % 60) + ".";
                    } else {
                        str += ":" + (busses[i] % 60) + ".";
                    }
                    System.out.println(str);
                }
            }
        }
    }
}
