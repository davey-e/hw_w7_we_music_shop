package MusicShop.Items.Instruments;

import MusicShop.Behaviours.IPlayable;
import MusicShop.Enums.InstrumentType;
import MusicShop.Enums.PianoType;

public class Piano extends Instrument implements IPlayable {

    private int numberOfKeys;
    private PianoType pianoType;

    public Piano(double buyPrice, double sellPrice, InstrumentType instrumentType, String material, String colour, int numberOfKeys, PianoType pianoType){
        super(buyPrice, sellPrice, instrumentType, material, colour);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public PianoType getPianoType() {
        return this.pianoType;
    }

    public String play() {
        return "Tickling the ivories";
    }
}
