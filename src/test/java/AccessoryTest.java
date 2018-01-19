import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory(10.00, 15.00,"Guitar Strings", "Set of 5 bass guitar strings");
    }

    @Test
    public void hasAccessoryType(){
        assertEquals("Guitar Strings", accessory.getAccessoryType());
    }

    @Test
    public void hasDescription(){
        assertEquals("Set of 5 bass guitar strings", accessory.getDescription());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5.00, accessory.calculateMarkup(),0.01);
    }
}
