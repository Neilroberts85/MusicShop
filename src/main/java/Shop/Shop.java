package Shop;

import Interfaces.ISell;
import ItemsForSale.Instrument.Instrument;
import ItemsForSale.SellableItem;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<SellableItem> stock;

    private int till;

    public Shop(String name, int till) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }
    public void addToTill(int amount){
        till += amount;
    }
    public void removeFromTill(int amount){
        till -= amount;
    }
    public void buyItem(SellableItem sellableItem){
        removeFromTill(sellableItem.getCostPrice());
        addItemToStock(sellableItem);

    }
    public void sellItem(SellableItem sellableItem){
        addToTill(sellableItem.getSellPrice());
        removeItemFromStock(sellableItem);
    }

    public ArrayList<SellableItem> getStock() {
        return stock;
    }
    public int getNumberOfItemsInStock(){
        return stock.size();
    }
    public void addItemToStock(SellableItem sellableItem){
        stock.add(sellableItem);
    }
    public void removeItemFromStock(SellableItem sellableItem){
        stock.remove(sellableItem);
    }
    public int potentialProfit(){
       return stock.stream()
               .mapToInt(SellableItem::calculateMarkup)
               .sum();
    }
}
