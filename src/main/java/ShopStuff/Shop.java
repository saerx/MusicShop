package ShopStuff;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addToStock(ISell stockItem){
        this.stock.add(stockItem);
    }

    public void removeFromStock(ISell stockItem){
        this.stock.remove(stockItem);
    }

    public int getStock(){
        return this.stock.size();
    }

    public double getPotentialProfit(){
        double potentialProfit = 0;
        for (ISell stockItem : this.stock) {
            double markup = stockItem.calculateMarkup();
            potentialProfit += markup;
        }
        return potentialProfit;
    }
}
