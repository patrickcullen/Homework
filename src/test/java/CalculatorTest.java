import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator("Calculator", 9.4, 3.2);
    }

    @Test
    public void hasName() {
        assertEquals("Calculator", testCalculator.getName());
    }

    @Test
    public void hasNum1() {
        assertEquals(9.4, testCalculator.getNum1(),0.01);
    }

    @Test
    public void hasNum2() {
        assertEquals(3.2, testCalculator.getNum2(), 0.01);
    }

    @Test
    public void canAdd() {
        assertEquals(12.6, testCalculator.Add(), 0.01);
    }

    @Test
    public void canSubtract() {
        assertEquals(6.2, testCalculator.Subtract(), 0.01);
    }

    @Test
    public void canMultiply() {
        assertEquals(30.08, testCalculator.Multiply(), 0.01);
    }

    @Test
    public void canDivide() {
        assertEquals(2.9375, testCalculator.Divide(), 0.01);
    }
}
