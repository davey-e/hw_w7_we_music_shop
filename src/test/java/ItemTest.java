import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void before(){
        item = new Item(100.00, 150.00);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, item.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(150.00, item.getSellPrice(), 0.01);
    }
}
