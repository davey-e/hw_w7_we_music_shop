package MusicShop.Enums;

public enum InstrumentType {

    GUITAR("Guitar"),
    PIANO("Piano"),
    TRUMPET("Trumpet"),
    DRUMS("Drums"),
    VIOLIN("Violin");

    private final String instrumentType;

    InstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentTypeAsString(){
        return this.instrumentType;
    }
}
