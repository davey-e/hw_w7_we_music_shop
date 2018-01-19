import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar", "Wood", "Red", 5, "Bass");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals("Guitar", guitar.getInstrumentType());
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
