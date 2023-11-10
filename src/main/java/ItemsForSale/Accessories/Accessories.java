package ItemsForSale.Accessories;

import Interfaces.ISell;
import ItemsForSale.SellableItem;

public abstract class Accessories extends SellableItem implements ISell {


    public Accessories(String name, int costPrice, int sellPrice) {
        super(name, costPrice, sellPrice);
    }
}
