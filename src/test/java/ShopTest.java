import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Accessory accessory;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        accessory = new Accessory(10.00, 15.00, "Guitar Strings", "Set of 5 bass guitar strings");
        guitar = new Guitar(100.00, 150.00, "Guitar", "Wood", "Red", 5, "Bass");
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void itemsArrayListStartsEmpty(){
        assertEquals(0, shop.getNumberOfItems());
    }

    @Test
    public void canAddAccessoryItemToArrayList(){
        shop.addItem(accessory);
        assertEquals(1, shop.getNumberOfItems());
    }

    @Test
    public void canAddInstrumentItemToArrayList(){
        shop.addItem(guitar);
        assertEquals(1, shop.getNumberOfItems());
    }
}
