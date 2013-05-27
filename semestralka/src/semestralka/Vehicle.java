/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralka;

/**
 *
 * @author Filip
 */
public class Vehicle {
}

class Bus extends Vehicle {

    private double currentStop = 1;
    private double time = 0;
    private int busStart;
    private int riders = 0;
    private int interval;
    private int maximum_riders = 40;

    public Bus(int busStart, int interval) {
        this.busStart = busStart;
        this.interval = interval;

        
    }
    class Rider extends Vehicle{
        private int stop;
        private int waitTime;
        private int timeAtStop;
        private int busToTake;
        private int stopGetOff;
        private int passNum;
        
            
        public Rider(){
                this.stop = this.waitTime = this.timeAtStop = this.busToTake = this.stopGetOff = 0;
        }
        public Rider(int stop, int timeAtStop, int passNum){
                this.stop = stop;
                this.waitTime = 0;
                this.timeAtStop = timeAtStop;
                this.passNum = passNum;
    }
         public int getBus(){return this.busToTake;}
        
        public int getStopOff(){return this.stopGetOff;}
        
        public int getStop(){return this.stop;}
        
        public int getWaitTime(){return this.waitTime;}
        
        public int getTimeAtStop(){return this.timeAtStop;}
        
        public void setStop(int stop){this.stop = stop;}
        
        public void setWaitTime(int waitTime){this.waitTime = waitTime;}
        
        public void setTimeAtStop(int timeAtStop){this.timeAtStop = timeAtStop;}
        
        public void setBustTake(int busToTake){this.busToTake = busToTake;}
        
        public void setStopOff(int stopGetOff){this.stopGetOff = stopGetOff;}
    }

    private void jed() {
        int max_na_zastavce = 0;
        /*
         if (interval < 10) {
         max_na_zastavce = 2;
         } else if (interval < 40) {
         max_na_zastavce = 5;
         } else if (interval < 60) {
         max_na_zastavce = 10;
         } else {
         max_na_zastavce = 15;
         }
         */
        double actualTime = this.busStart + this.time;

        if (actualTime > 600 && actualTime < 840) { //je kolem poledne
            max_na_zastavce = interval / 9;
        } else {
            max_na_zastavce = interval / 11;
        }
        //projedeme pres vsechny zastavky
        for (int i = 0; i < 10; i++) {
            int nastupuje = (int) (Math.random() * max_na_zastavce);
            nastupuje = Math.min(nastupuje, (this.maximum_riders - this.riders));

            int vystupuje = (int) (Math.random() * max_na_zastavce);
            vystupuje = Math.min(vystupuje, this.riders);

            this.riders = this.riders + nastupuje - vystupuje;

            //nastup+vystup
            this.time += 1;

            double cas_mezi_zastavkama = (Math.random() * 10);
            this.time += cas_mezi_zastavkama;

        }
    }

    public int getRiders() {
        return riders;
    }

    public void setRiders(int riders) {
        this.riders = riders;
    }class Car extends Vehicle {
}
}