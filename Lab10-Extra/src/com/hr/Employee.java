package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * OPTION 4: try-catch and throw a different exception at the client
     * NOTE: we will "wrap" the DestinationUnreachableException into a new
     * WorkException
     */
    public void goToWork() throws WorkException {
        Car c = new Car("ABC123", "Hondacedes", "Accord");

        try {
            c.start();
            c.moveTo("Hawaii");
        }
        catch (DestinationUnreachableException e) {
            //insert this exception
            throw new WorkException("Unable to get to work", e); //e is the cause
        } finally {
            c.stop();
        }
    }

   /*
   OPTION 3: try-catch, "react in some way," Then rethrow back at the client
    */
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("ABC123", "Hondacedes", "Accord");
//
//        try {
//            c.start();
//            c.moveTo("Hawaii");
//        }
//        catch (DestinationUnreachableException e) {
//            System.out.println("Emailing Lisa to complain");
//            throw e;
//        } finally {
//            c.stop();
//        }
//    }


    /*
     * OPTION 2: PUNT ie DON'T catch the exception at all, just "ignore" it.
     */
//    public void goToWork() throws DestinationUnreachableException {
//        Car c = new Car("ABC123", "Hondacedes", "Accord");
//
//        try {
//            c.start();
//            c.moveTo("West Seattle");
//        } finally {
//            c.stop();
//        }
//    }

    /*
     OPTION 1: try-catch and "handle" it in some way, so the exception stops here
     */
//    public void goToWork() {
//        Car c = new Car("ABC123", "Hondacedes", "Accord");
//
//        try {
//            c.start();
//            c.moveTo("Hawaii");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            c.stop();
//        }
//    }

    //ACCESSOR METHODS
//    public String getName() {
//        returns name;
//    }
}