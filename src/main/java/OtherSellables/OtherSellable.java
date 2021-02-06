package OtherSellables;

import ShopStuff.ISell;

public abstract class OtherSellable implements ISell {

    private String description;
    private double purchasedPrice;
    private double salePrice;

    public OtherSellable(String description, double purchasedPrice, double salePrice) {
        this.description = description;
        this.purchasedPrice = purchasedPrice;
        this.salePrice = salePrice;
    }

    public String getDescription() {
        return description;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
