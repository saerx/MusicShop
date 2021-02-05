package Instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType type, int numberOfKeys) {
        super(material, colour, type);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "*piano noises*";
    }
}
