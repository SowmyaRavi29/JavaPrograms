package oopsPgm;

public class CommercialMain {
    public static void main(String[] args) {

        StockAccount acc = new StockAccount();

        acc.buy("TCS", 50);
        acc.buy("INFY", 20);
        acc.sell("TCS", 10);
        acc.printReport();
    }
}
