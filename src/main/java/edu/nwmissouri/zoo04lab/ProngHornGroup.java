package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * This is ProngHorn group class.
 * @author Alekhya Gandra
 */
public class ProngHornGroup {
    
    private static ArrayList<ProngHorn> myGroup;

    /**
     * Create a static group of ProngHorny
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new ProngHorn("Alekhya"));
        myGroup.add(new ProngHorn("Rachu"));
        myGroup.add(new ProngHorn("Gandra"));

        return myGroup.size();
    }
    /** 
     * function run prints the statements
     */

    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the pronghorn!");
        for (ProngHorn pronghorn : myGroup) {
            pronghorn.speak();
            pronghorn.move();
            pronghorn.mul(3,2);
            pronghorn.sub(3,2);
<<<<<<< HEAD
             pronghorn.profess1();
=======
            pronghorn.profess1();
>>>>>>> d6d5d7654860ce763bfe107ee87bddcc6d5cac95

        }

        System.out.println("Nice pronghorn - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}
