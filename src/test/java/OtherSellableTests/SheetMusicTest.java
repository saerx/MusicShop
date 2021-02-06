package OtherSellableTests;

import OtherSellables.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Beatles Best Beats", 4, 12);
    }

    @Test
    public void hasDescription(){
        assertEquals("Beatles Best Beats", sheetMusic.getDescription());
    }

    @Test
    public void hasPurchasedPrice(){
        assertEquals(4, sheetMusic.getPurchasedPrice(), 0.0);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(12, sheetMusic.getSalePrice(), 0.0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(8, sheetMusic.calculateMarkup(), 0.0);
    }

}
