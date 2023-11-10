package ItemsForSale;

public abstract class SellableItem {

    private String name;
    private int costPrice;
    private int sellPrice;

    public SellableItem(String name, int costPrice, int sellPrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup() {
        return getSellPrice()-getCostPrice();
    }
}
