public class Piano {

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
}
