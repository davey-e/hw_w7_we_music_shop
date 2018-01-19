import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISellable> items;

    public Shop(String name){
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfItems() {
        return this.items.size();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public boolean itemExists(Item item) {
        boolean itemFound = false;
        for(int i =0; i < this.getNumberOfItems(); i++){
            if (this.items.get(i) == item){
                itemFound = true;
            }
        }
        return itemFound;
    }
}
