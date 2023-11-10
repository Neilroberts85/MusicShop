package InstrumentTests;

import ItemsForSale.Instrument.InstrumentType;
import ItemsForSale.Instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(InstrumentType.STRING, "Baby Grand", 8000, 15000, 3);
    }
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, piano.getInstrumentType() );
    }
    @Test
    public void hasName(){
        assertEquals("Baby Grand", piano.getName());
    }
    @Test
    public void hasCostPrice(){
        assertEquals(8000, piano.getCostPrice());
    }
    @Test
    public void hasSellPrice(){
        assertEquals(15000, piano.getSellPrice());
    }
    @Test
    public void hasNumberOfPedals(){
        assertEquals(3, piano.getNumberOfPedals());
    }
    @Test
    public void hasMarkup(){
        assertEquals(7000, piano.calculateMarkup());
    }
    @Test
    public void canPlay(){
        assertEquals("Tinkle Tinkle", piano.play());
    }
}

