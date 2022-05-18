package ATM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashTest {

    @Test
    void deposit() {
        Cash cs =new Cash(500);
        cs.deposit(500);
        assertTrue(cs.getAmountofmoney()==1000);
    }

    @Test
    void withdrawal() {
        Cash cs = new Cash(500);
        assertEquals(0, cs.withdrawal(50));
        assertEquals(-1, cs.withdrawal(500));
    }
}