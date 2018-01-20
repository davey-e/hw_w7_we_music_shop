import MusicShop.Enums.GuitarType;
import MusicShop.Enums.InstrumentType;
import MusicShop.Items.Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(100.00, 150.00, InstrumentType.GUITAR, "Wood", "Red", 5, GuitarType.BASS);
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.BASS, guitar.getGuitarType());
    }

    @Test
    public void canGetGuitarTypeAsString(){
        assertEquals("Bass", guitar.getGuitarType().getGuitarTypeAsString());
    }

    @Test
    public void canPlay(){
        assertEquals("Strumming on a guitar", guitar.play());
    }

}
