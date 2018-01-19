package MusicShop.Items.Accessories;

import MusicShop.Items.Item;

public class Accessory extends Item {

    private String accessoryType;
    private String description;

    public Accessory(double buyPrice, double sellPrice, String accessoryType, String description){
        super(buyPrice, sellPrice);
        this.accessoryType = accessoryType;
        this.description = description;
    }

    public String getAccessoryType() {
        return this.accessoryType;
    }

    public String getDescription() {
        return this.description;
    }
}
