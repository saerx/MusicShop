package Instruments;

import ShopStuff.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType type;
    private double purchasedPrice;
    private double salePrice;

    public Instrument(String material, String colour, InstrumentType type, double purchasedPrice, double salePrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.purchasedPrice = purchasedPrice;
        this.salePrice = salePrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
