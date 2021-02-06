package Instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String colour, InstrumentType type, int numberOfKeys, double purchasedPrice, double salePrice) {
        super(material, colour, type, purchasedPrice, salePrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "*piano noises*";
    }

    public double calculateMarkup() {
        return this.getSalePrice() - this.getPurchasedPrice();
    }
}
