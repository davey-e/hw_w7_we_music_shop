public class Instrument {

    private String instrumentType;
    private String material;
    private String colour;

    public Instrument(String instrumentType, String material, String colour){
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
