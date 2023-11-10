package ShopTest;

import ItemsForSale.Instrument.Guitar;
import ItemsForSale.Instrument.InstrumentType;
import ItemsForSale.Instrument.Piano;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

    @Before
    public void before(){
        shop = new Shop("Neils Notes", 1000);
        guitar = new Guitar(InstrumentType.STRING, "Strat", 300, 800, 6);
        piano = new Piano(InstrumentType.STRING, "Baby Grand", 8000, 15000, 3);
    }
    @Test
    public void hasName(){
        assertEquals("Neils Notes", shop.getName());
    }
    @Test
    public void hasEmptyStock(){
        assertEquals(0, shop.getStock().size());
    }
    @Test
    public void hasTill(){
        assertEquals(1000, shop.getTill());
    }
    @Test
    public void canAddItemToStock(){
        shop.addItemToStock(guitar);
        assertEquals(guitar, shop.getStock().get(0));
    }
    @Test
    public void canRemoveItemFromStock(){
        shop.addItemToStock(guitar);
        assertEquals(guitar, shop.getStock().get(0));
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getStock().size());
    }
    @Test
    public void getTotalPotentialProfits(){
        shop.addItemToStock(piano);
        shop.addItemToStock(guitar);
        shop.potentialProfit();
        assertEquals(7500, shop.potentialProfit());
    }
    @Test
    public void canBuyItem(){
        assertEquals(1000, shop.getTill());
        shop.buyItem(guitar);
        assertEquals(700, shop.getTill());
        assertEquals(1, shop.getNumberOfItemsInStock());
        assertEquals(guitar, shop.getStock().get(0));
    }
    @Test
    public void canSellItem(){
        assertEquals(1000, shop.getTill());
        shop.buyItem(guitar);
        assertEquals(700, shop.getTill());
        assertEquals(1, shop.getNumberOfItemsInStock());
        assertEquals(guitar, shop.getStock().get(0));
        shop.sellItem(guitar);
        assertEquals(1500, shop.getTill());
        assertEquals(0, shop.getNumberOfItemsInStock());

    }
}
