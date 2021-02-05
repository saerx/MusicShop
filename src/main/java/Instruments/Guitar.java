package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType type, int numberOfStrings) {
        super(material, colour, type);
        this.numberOfStrings = numberOfStrings;

    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "*guitar noises*";
    }
}
