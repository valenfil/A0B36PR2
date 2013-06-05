/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

import java.util.ArrayList;

/**
 *
 * @author Filip
 */
public class Test {

    private ArrayList<Vlak> vlaky;
    private ArrayList<Cestujici> cestujici;
    private int pocetVlaku = 0;
    private int interval;
    private int time = 0;
    private int maxTime = 1440;
    private int totalBuses = 0;

    public Test(int interval) {
        this.vlaky = new ArrayList();
        this.cestujici = new ArrayList();
        this.interval = interval;
        this.totalBuses = runTest();
    }

    private int runTest() {
     int vlakID;
        for (int i = 0; i < maxTime; i += interval) {
            vlakID++;
            Vlak vlak = new Vlak(i, interval);
            vlak.getCesujici();
        }
for (int i = 0; i)
        
        return vlakID;
    }

    public int getTotalBuses() {
        return this.totalBuses;
    }
}
