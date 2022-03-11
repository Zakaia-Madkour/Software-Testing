import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void evenly_divisible() {
        // here we will take values out of range ex: -1, 200
        //                   values in range and return true ex: 20, 50, 80
        //                   values in range and return false ex: 2, 51, 75

        // create an instance of the class to use its function
        Watermelon my_melon =new Watermelon();
        // values out of range ex: -1, 200
        assertEquals(null,my_melon.evenly_divisible(-1));
        assertEquals(null,my_melon.evenly_divisible(200));
        // values in range and return true ex: 20, 50, 80
        assertEquals(true,my_melon.evenly_divisible(20));
        assertEquals(true,my_melon.evenly_divisible(50));
        assertEquals(true,my_melon.evenly_divisible(80));
        // values in range and return false ex: 2, 51, 75
        assertEquals(false,my_melon.evenly_divisible(2));
        assertEquals(false,my_melon.evenly_divisible(51));
        assertEquals(false,my_melon.evenly_divisible(75));

    }
}