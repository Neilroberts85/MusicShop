package InstrumentTests;

import ItemsForSale.Instrument.Drums;
import ItemsForSale.Instrument.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums(InstrumentType.PERCUSSION, "Big Drums", 200, 400, 7);
    }
    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, drums.getInstrumentType() );
    }
    @Test
    public void hasName(){
        assertEquals("Big Drums", drums.getName());
    }
    @Test
    public void hasCostPrice(){
        assertEquals(200, drums.getCostPrice());
    }
    @Test
    public void hasSellPrice(){
        assertEquals(400, drums.getSellPrice());
    }
    @Test
    public void hasNumberOfDrums(){
        assertEquals(7, drums.getNumberOfDrums());
    }
    @Test
    public void hasMarkup(){
        assertEquals(200, drums.calculateMarkup());
    }
    @Test
    public void canPlay(){
        assertEquals("Bash", drums.play());
    }
}
