import MusicShop.Items.Accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory(100.00, 150.00, "Guitar Strings", "Set of 5 bass guitar strings");
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, accessory.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(150.00, accessory.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50.00, accessory.calculateMarkup(),0.01);
    }
}
