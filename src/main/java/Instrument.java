public abstract class Instrument extends Item{

    private String instrumentType;
    private String material;
    private String colour;

    public Instrument(double buyPrice, double sellPrice, String instrumentType, String material, String colour){
        super(buyPrice, sellPrice);
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
    }
    public String getInstrumentType() {
        return this.instrumentType;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }
}
