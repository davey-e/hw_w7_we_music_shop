package MusicShop.Items;

import MusicShop.Behaviours.ISellable;

public abstract class Item implements ISellable {

    private double buyPrice;
    private double sellPrice;

    public Item(double buyPrice, double sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }
}
