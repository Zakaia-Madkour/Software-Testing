package DigitalWatch;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatchStateTest {
    static WatchState statestest;
    @org.junit.jupiter.api.Nested
    public class EdgeCoverage {
        //suite = "aacbabababababad"
        @org.junit.jupiter.api.BeforeAll
        public static void initialise() {
            System.out.println("Initializing Edge Coverage Testing...");
            System.out.println("Test suite used is 'aacbabababababadcd'");
            System.out.println("Initially: ");
            statestest = new WatchState();
            statestest.displayTime();
            statestest.displayDate();
        }

        @Test
        public void EC1() {

            statestest.inputs("aacbabababababadcd");
            Assertions.assertEquals(statestest.getCurrstate(), WatchState.states.NORMAL);
            Assertions.assertEquals(statestest.getCurrinnerstate(), WatchState.innerstates.TIME);
        }



        @AfterAll
        public static void finalise() {
            System.out.println("Edge Coverage Testing DONE");
            statestest = null;
        }
    }

}