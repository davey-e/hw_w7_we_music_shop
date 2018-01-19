public class Piano implements IPlayable{

    private int numberOfKeys;
    private String pianoType;

    public Piano(int numberOfKeys, String pianoType){
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
