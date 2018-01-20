package MusicShop.Items.Instruments;

import MusicShop.Enums.InstrumentType;
import MusicShop.Items.Item;

public abstract class Instrument extends Item {

    private InstrumentType instrumentType;
    private String material;
    private String colour;

    public Instrument(double buyPrice, double sellPrice, InstrumentType instrumentType, String material, String colour){
        super(buyPrice, sellPrice);
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
    }
    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }
}
