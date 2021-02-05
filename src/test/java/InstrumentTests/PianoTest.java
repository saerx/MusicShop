package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 88);
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
}
