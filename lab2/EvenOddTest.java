import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    @DisplayName("Negative number case 1")
    public void negativeNumber(){
        assertEquals(EvenOdd.evenodd(-4),"neither even nor odd");
    }
    @Test
    @DisplayName("Negative number case 2")
    public void negativeNumber2(){
        assertEquals(EvenOdd.evenodd(-55),"neither even nor odd");
    }

    @Nested
    class accepted{
        @Nested
        class even{
            @Test
            @DisplayName("Small even case 1")
            public void two(){
                assertEquals(EvenOdd.evenodd(2),"even");
            }
            @Test
            @DisplayName("Small even case 2")
            public void six(){
                assertEquals(EvenOdd.evenodd(6),"even");
            }
            @Test
            @DisplayName("Large even case 3")
            public void onemill(){
                assertEquals(EvenOdd.evenodd(1000000),"even");
            }
            @Test
            @DisplayName("Large even case 4")
            public void onemillandfour(){
                assertEquals(EvenOdd.evenodd(1000004),"even");
            }
            @Test
            @DisplayName("Small even- boundary value- case 5")
            public void zero(){
                assertEquals(EvenOdd.evenodd(0),"even");
            }
        }
        @Nested
        class odd{
            @Test
            @DisplayName("Small odd case 1")
            public void one(){
                assertEquals(EvenOdd.evenodd(1),"odd");
            }
            @Test
            @DisplayName("Small odd case 2")
            public void seven(){
                assertEquals(EvenOdd.evenodd(7),"odd");
            }
            @Test
            @DisplayName("Small odd case 3")
            public void thousandandone(){
                assertEquals(EvenOdd.evenodd(1001),"odd");
            }
            @Test
            @DisplayName("Small odd case 4")
            public void millandfive(){
                assertEquals(EvenOdd.evenodd(1000005),"odd");
            }
        }
    }

}