public class Accessory {

    private String accessoryType;
    private String description;

    public Accessory(String accessoryType, String description){
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
