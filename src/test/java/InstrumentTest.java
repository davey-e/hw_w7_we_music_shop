import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument("Guitar", "Wood", "Red");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals("Guitar", instrument.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", instrument.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Red", instrument.getColour());
    }
}
