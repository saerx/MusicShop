package ShopTests;

import Instruments.InstrumentType;
import Instruments.Piano;
import OtherSellables.DrumSticks;
import ShopStuff.ISell;
import ShopStuff.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShopTest {

    private Shop shop;
    private ISell piano;
    private ISell drumSticks;

    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 88, 200, 400);
        drumSticks = new DrumSticks("Sticks for Sticklers", 4, 12);
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(piano);
        shop.addToStock(drumSticks);
        assertEquals(2, shop.getStock());
    }

    @Test
    public void canRemoveStock(){
        shop.addToStock(piano);
        shop.addToStock(drumSticks);
        assertEquals(2, shop.getStock());
        shop.removeFromStock(drumSticks);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addToStock(piano);
        shop.addToStock(drumSticks);
        double potentialProfit = shop.getPotentialProfit();
        assertEquals(208, potentialProfit, 0.0);
    }



}
