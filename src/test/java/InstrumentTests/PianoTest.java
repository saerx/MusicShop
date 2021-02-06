package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 88, 200, 400);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("*piano noises*", piano.play());
    }

    @Test
    public void hasPurchasedPrice(){
        assertEquals(200, piano.getPurchasedPrice(), 0.0);
    }

    @Test
    public void hasSalePirce(){
        assertEquals(400, piano.getSalePrice(), 0.0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(200, piano.calculateMarkup(), 0.0);
    }
}
