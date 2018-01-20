package MusicShop.Items.Instruments;

import MusicShop.Behaviours.IPlayable;
import MusicShop.Enums.GuitarType;
import MusicShop.Enums.InstrumentType;

public class Guitar extends Instrument implements IPlayable {

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(double buyPrice, double sellPrice, InstrumentType instrumentType, String material, String colour, int numberOfStrings, GuitarType guitarType){
        super(buyPrice, sellPrice, instrumentType, material, colour);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public GuitarType getGuitarType() {
        return this.guitarType;
    }

    public String play() {
        return "Strumming on a guitar";
    }

}
