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

    private ArrayList<Bus> buses;
    private int num_of_busses = 0;
    private int interval;
    private int time = 0;
    private int maxTime = 1440;
    private int totalBuses = 0;

    public Test(int interval) {
        this.buses = new ArrayList();
        this.interval = interval;
        this.totalBuses = runTest();
    }

    private int runTest() {
        int busId = 0;
        for (int i = 0; i < maxTime; i += interval) {
            busId++;
            Bus autobus = new Bus(i, interval);
            autobus.getRiders();
        }

        return busId;
    }

    public int getTotalBuses() {
        return this.totalBuses;
    }
}
