package OtherSellables;

import ShopStuff.ISell;

public class SheetMusic extends OtherSellable {


    public SheetMusic(String description, double purchasedPrice, double salePrice) {
        super(description, purchasedPrice, salePrice);
    }

    public double calculateMarkup() {
        return this.getSalePrice() - this.getPurchasedPrice();
    }
}
