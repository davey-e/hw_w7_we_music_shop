public class Guitar extends Instrument implements IPlayable{

    private int numberOfStrings;
    private String guitarType;

    public Guitar(double buyPrice, double sellPrice, String instrumentType, String material, String colour, int numberOfStrings, String guitarType){
        super(buyPrice, sellPrice, instrumentType, material, colour);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String getGuitarType() {
        return this.guitarType;
    }

    public String play() {
        return "Strumming on a guitar";
    }

}
