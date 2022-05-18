package CoffeeMachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeaterTest {
    @Test
    void setTemp() {
        Heater ht =new Heater();
        for(int i=0;i<100000;i++){
            assertEquals(i<1000?i:-1,ht.setTemp(i));
        }
    }

}