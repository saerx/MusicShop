package OtherSellables;

import ShopStuff.ISell;

public class SheetMusic extends OtherSellable implements ISell {


    public SheetMusic(String description, double purchasedPrice, double salePrice) {
        super(description, purchasedPrice, salePrice);
    }

    public double calculateMarkup() {
        return this.getSalePrice() - this.getPurchasedPrice();
    }
}
