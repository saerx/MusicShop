package OtherSellableTests;

import OtherSellables.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Sticks for Sticklers", 4, 12);
    }

    @Test
    public void hasDescription(){
        assertEquals("Sticks for Sticklers", drumSticks.getDescription());
    }

    @Test
    public void hasPurchasedPrice(){
        assertEquals(4, drumSticks.getPurchasedPrice(), 0.0);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(12, drumSticks.getSalePrice(), 0.0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(8, drumSticks.calculateMarkup(), 0.0);
    }
}
