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
public class BusStop {

    private final ArrayList<Bus> allBuses = new ArrayList<>();
    private int StopID;

    public class qRiders {

        private Rider first;
        private Rider last;
        private int size;
        public qRiders() {
            this.size = 0;
        }
    }

    private class Rider {

        private int value;
        private Rider next;

        private Rider(int value) {
            this.value = value;
        }
    }
}
