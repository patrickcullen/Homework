import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer testPrinter;

    @Before
    public void before() {
        testPrinter = new Printer("Printer", 40, 420);
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
        assertEquals(420, testPrinter.getToner());
    }

    @Test
    public void passArgs__less() {
        assertEquals(20, testPrinter.acceptArgs(2,10));
        assertEquals(400,testPrinter.getToner());
    }

    @Test
    public void passArgs__more() {
        assertEquals(40, testPrinter.acceptArgs(2,100));
    }

    @Test
    public void fillsPrinter() {
        assertEquals(400, testPrinter.fillPrinter());
    }


}
