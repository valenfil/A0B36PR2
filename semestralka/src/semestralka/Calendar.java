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
public class Calendar {
     ArrayList<Udalosti> seznam;
        public void Pridej(Udalosti udalost)
        {
            seznam.add(udalost);
        }
       
        public Calendar()
        {
            seznam = new ArrayList<Udalosti>();
        }
    }

