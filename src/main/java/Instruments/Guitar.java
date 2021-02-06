package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType type, int numberOfStrings, double purchasedPrice, double salePrice) {
        super(material, colour, type, purchasedPrice, salePrice);
        this.numberOfStrings = numberOfStrings;

    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "*guitar noises*";
    }

    public double calculateMarkup() {
        return this.getSalePrice() - getPurchasedPrice();
    }
}
