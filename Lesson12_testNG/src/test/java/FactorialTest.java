import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    public void testFactorial() {

        Assert.assertEquals(factorial.factorial(5),120);
    }
  @Test
    public void testFactorial2() {
        Assert.assertEquals(factorial.factorial(3),5);
    }
}