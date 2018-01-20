import MusicShop.Enums.GuitarType;
import MusicShop.Enums.InstrumentType;
import MusicShop.Items.Accessories.Accessory;
import MusicShop.Items.Instruments.Guitar;
import MusicShop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

    Shop shop;
    Accessory accessory1;
    Accessory accessory2;
    Guitar guitar1;
    Guitar guitar2;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        accessory1 = new Accessory(10.00, 15.00, "Guitar Strings", "Set of 5 bass guitar strings");
        accessory2 = new Accessory(5.00, 10.00, "Sheet Music", "Suzuki Piano Book 1");
        guitar1 = new Guitar(100.00, 150.00, InstrumentType.GUITAR, "Wood", "Red", 5, GuitarType.BASS);
        guitar2 = new Guitar(120.00, 160.00, InstrumentType.GUITAR, "Wood", "Blue", 6, GuitarType.ELECTRIC);
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
        shop.addItem(accessory1);
        assertEquals(1, shop.getNumberOfItems());
    }

    @Test
    public void canAddInstrumentItemToArrayList(){
        shop.addItem(guitar1);
        assertEquals(1, shop.getNumberOfItems());
    }

    @Test
    public void canRemoveAccessoryItemFromArrayList(){
        shop.addItem(accessory1);
        shop.addItem(accessory2);
        shop.removeItem(accessory1);
        assertEquals(1, shop.getNumberOfItems());
        assertTrue(shop.itemExists(accessory2));
    }

    @Test
    public void canRemoveInstrumentItemFromArrayList(){
        shop.addItem(guitar1);
        shop.addItem(guitar2);
        shop.removeItem(guitar1);
        assertEquals(1, shop.getNumberOfItems());
        assertTrue(shop.itemExists(guitar2));
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.addItem(accessory1);
        shop.addItem(accessory2);
        shop.addItem(guitar1);
        shop.addItem(guitar2);
        assertEquals(100.00, shop.calculateTotalPotentialProfit(), 0.01);
    }

}
