package InstrumentTests;

import ItemsForSale.Instrument.Guitar;
import ItemsForSale.Instrument.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRING, "Strat", 300, 800, 6);
    }
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType() );
    }
    @Test
    public void hasName(){
        assertEquals("Strat", guitar.getName());
    }
    @Test
    public void hasCostPrice(){
        assertEquals(300, guitar.getCostPrice());
    }
    @Test
    public void hasSellPrice(){
        assertEquals(800, guitar.getSellPrice());
    }
    @Test
    public void hasNumberOfDrums(){
        assertEquals(6, guitar.getNumberOfStrings());
    }
    @Test
    public void hasMarkup(){
        assertEquals(500, guitar.calculateMarkup());
    }
    @Test
    public void canPlay(){
        assertEquals("Strum", guitar.play());
    }
}

