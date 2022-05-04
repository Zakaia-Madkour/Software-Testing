import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

   @Nested
    class test1 {
       double[] x;

       @BeforeEach
       public void init0() {
           x = new double[]{};
       }

       @Test
       @DisplayName("Empty Array min")
       public void empty1() {
           assertEquals(MinMax.min(x), null);
       }

       @Test
       @DisplayName("Empty Array max")
       public void empty2() {
           assertEquals(MinMax.max(x), null);
       }

       @AfterEach
       public void exit0() {
           x = null;
       }
    }

    @Nested
    class test2 {

        double[] x;
        @BeforeEach
        public void init() {
            x = new double[]{200, 300, 241, -1000, -971.5, -1234.654, 99999.9999, 100000};
        }

        @Test
        @DisplayName("min test 1")
        public void min1() {
            assertEquals((double) MinMax.min(x), -1234.654);
        }

        @Test
        @DisplayName("max test 1")
        public void max1() {
            assertEquals((double) MinMax.max(x), 100000);
        }

        @AfterEach
        public void exit() {
            x = null;
        }
    }

    @Nested
    class test3 {

        double[] x;
       @BeforeEach
       public void init2(){
           x = new double[]{0.00001,-.00000000002,0.004,0};
       }
       @Test
       @DisplayName("min test 2")
       public void min2(){
           assertEquals((double) MinMax.min(x),-.00000000002);
       }
       @Test
       @DisplayName("max test 2")
       public void max2(){
           assertEquals((double) MinMax.max(x),0.004);
       }
       @AfterEach
       public void exit2(){
           x = null;
       }
   }
}