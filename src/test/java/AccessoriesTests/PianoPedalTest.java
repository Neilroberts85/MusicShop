package AccessoriesTests;

import ItemsForSale.Accessories.PianoPedal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoPedalTest {

    PianoPedal pianoPedal;

    @Before
    public void before(){
        pianoPedal = new PianoPedal("noisy pedal",10,17);
    }

    @Test
    public void hasName(){
        assertEquals("noisy pedal", pianoPedal.getName());
    }
    @Test
    public void hasCostPrice(){
        assertEquals(10, pianoPedal.getCostPrice());
    }
    @Test
    public void hasSellPrice(){
        assertEquals(17, pianoPedal.getSellPrice());
    }
    @Test
    public void hasMarkup(){
        assertEquals(7, pianoPedal.calculateMarkup());
    }
}

