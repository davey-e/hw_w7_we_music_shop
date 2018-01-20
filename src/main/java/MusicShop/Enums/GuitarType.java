package MusicShop.Enums;

public enum GuitarType {

    BASS("Bass"),
    ELECTRIC("Electric"),
    ACOUSTIC("Acoustic");

    private final String guitarType;

    GuitarType(String guitarType) {
        this.guitarType = guitarType;
    }

    public String getGuitarTypeAsString(){
        return this.guitarType;
    }
}
