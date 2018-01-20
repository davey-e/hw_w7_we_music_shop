import MusicShop.Enums.InstrumentType;
import MusicShop.Items.Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(400.00, 550.00, InstrumentType.PIANO, "Wood", "Brown", 88, "Upright");
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void hasPianoType(){
        assertEquals("Upright", piano.getPianoType());
    }

    @Test
    public void canPlay(){
        assertEquals("Tickling the ivories", piano.play());
    }
}
