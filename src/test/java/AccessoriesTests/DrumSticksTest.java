package AccessoriesTests;

import ItemsForSale.Accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("2 Stix",2,5);
    }

    @Test
    public void hasName(){
        assertEquals("2 Stix", drumSticks.getName());
    }
    @Test
    public void hasCostPrice(){
        assertEquals(2, drumSticks.getCostPrice());
    }
    @Test
    public void hasSellPrice(){
        assertEquals(5, drumSticks.getSellPrice());
    }
    @Test
    public void hasMarkup(){
        assertEquals(3, drumSticks.calculateMarkup());
    }
}
