package OtherSellables;

import ShopStuff.ISell;

public class DrumSticks extends OtherSellable implements ISell {

    public DrumSticks(String description, double purchasedPrice, double salePrice) {
        super(description, purchasedPrice, salePrice);
    }

    public double calculateMarkup() {
        return this.getSalePrice() - this.getPurchasedPrice();
    }
}
