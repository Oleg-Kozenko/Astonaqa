import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactotialTest {
    Factotial factotial = new Factotial();
    @Test
    void factorial() {

        assertEquals(120,factotial.factorial(5));
        assertEquals(6,factotial.factorial(3));
    }
}