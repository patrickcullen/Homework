import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    private Waterbottle testWaterbottle;

    @Before
    public void before() {
        testWaterbottle = new Waterbottle("Waterbottle", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Waterbottle", testWaterbottle.getName());
    }

    @Test
    public void hasVolume() {
        assertEquals(100, testWaterbottle.getVolume(), 0.01);
    }

    @Test
    public void doesDrink() {
        assertEquals(90, testWaterbottle.Drink(), 0.01);
    }

    @Test
    public void isEmpty() {
        assertEquals(0, testWaterbottle.Empty(), 0.01);
    }

    @Test
    public void isFull() {
        assertEquals(100, testWaterbottle.Fill(), 0.01);
    }

}
