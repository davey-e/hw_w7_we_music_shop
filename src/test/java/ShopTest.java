import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void itemsArrayListStartsEmpty(){
        assertEquals(0, shop.getNumberOfItems());
    }
}
