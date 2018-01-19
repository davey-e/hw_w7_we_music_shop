public class Piano extends Instrument implements IPlayable{

    private int numberOfKeys;
    private String pianoType;

    public Piano(String instrumentType, String material, String colour, int numberOfKeys, String pianoType){
        super(instrumentType, material, colour);
        this.numberOfKeys = numberOfKeys;
        this.pianoType = pianoType;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String getPianoType() {
        return this.pianoType;
    }

    public String play() {
        return "Tickling the ivories";
    }
}
