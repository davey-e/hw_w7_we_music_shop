import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar", "Wood", "Red", 5, "Bass");
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void hasGuitarType(){
        assertEquals("Bass", guitar.getGuitarType());
    }

    @Test
    public void canPlay(){
        assertEquals("Strumming on a guitar", guitar.play());
    }

}
