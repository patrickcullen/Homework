import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer testPrinter;

    @Before
    public void before() {
        testPrinter = new Printer("Printer", 40, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Printer", testPrinter.getName());
    }

    @Test
    public void hasPaper() {
        assertEquals(40, testPrinter.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(20, testPrinter.getToner());
    }


}
