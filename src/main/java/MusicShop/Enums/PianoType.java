package MusicShop.Enums;

public enum PianoType {

    UPRIGHT("Upright"),
    GRAND("Grand"),
    ELECTRIC("Electric"),;

    private final String pianoType;

    PianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public String getPianoTypeAsString(){
        return this.pianoType;
    }
}
