import MusicShop.Enums.GuitarType;
import MusicShop.Enums.InstrumentType;
import MusicShop.Items.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(100.00, 150.00, InstrumentType.GUITAR, "Wood", "Red", 5, GuitarType.BASS);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
    }

    @Test
    public void canGetInstrumentTypeAsString(){
        assertEquals("Guitar", guitar.getInstrumentType().getInstrumentTypeAsString());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", guitar.getColour());
    }
}
