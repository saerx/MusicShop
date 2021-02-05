package InstrumentTests;

import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "brown", InstrumentType.STRINGS, 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRINGS, guitar.getType());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("*guitar noises*", guitar.play());
    }
}