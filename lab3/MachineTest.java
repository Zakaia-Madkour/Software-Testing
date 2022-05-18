package CoffeeMachine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MachineTest {

    @Test
    void picktiming() {
        Machine cm =new Machine();
        cm.setType("Black");
        assertTrue(cm.picktiming()==1000);
        cm.setType("latte");
        assertTrue(cm.picktiming()==500);
    }

    @Test
    void picktemp() {
        Machine cm =new Machine();
        cm.setType("Black");
        assertTrue(cm.picktemp()==25);
        cm.setType("latte");
        assertTrue(cm.picktemp()==30);
    }

    @Test
    void startmaking() {}

}