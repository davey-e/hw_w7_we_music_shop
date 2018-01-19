public class Guitar implements IPlayable{

    private int numberOfStrings;
    private String guitarType;

    public Guitar(int numberOfStrings, String type){
        this.numberOfStrings = numberOfStrings;
        this.guitarType = type;
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
