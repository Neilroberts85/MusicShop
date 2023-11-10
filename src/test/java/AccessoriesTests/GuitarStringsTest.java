package AccessoriesTests;

import ItemsForSale.Accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings csharp;

    @Before
    public void before(){
        csharp = new GuitarStrings("C#",4,6);
    }

    @Test
    public void hasName(){
        assertEquals("C#", csharp.getName());
    }
    @Test
    public void hasCostPrice(){
        assertEquals(4, csharp.getCostPrice());
    }
    @Test
    public void hasSellPrice(){
        assertEquals(6, csharp.getSellPrice());
    }
    @Test
    public void hasMarkup(){
        assertEquals(2, csharp.calculateMarkup());
    }
}
