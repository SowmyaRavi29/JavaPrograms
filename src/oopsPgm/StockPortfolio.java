package oopsPgm;

import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {

    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double total = 0;
        for (Stock s : stocks)
            total += s.getStockValue();
        return total;
    }

    public void printReport() {
        System.out.println("\n========= STOCK REPORT =========");
        for (Stock s : stocks) {
            System.out.println("Stock: " + s.getName() +
                    " | Shares: " + s.getNumberOfShares() +
                    " | Price: " + s.getSharePrice() +
                    " | Value: " + s.getStockValue());
        }
        System.out.println("------------------------------------");
        System.out.println("Total Portfolio Value: " + getTotalValue());
    }
}
