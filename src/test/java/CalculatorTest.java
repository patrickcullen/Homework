import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator("Calculator", 12, 14);
    }

    @Test
    public void hasName() {
        assertEquals("Calculator", testCalculator.getName());
    }
}
