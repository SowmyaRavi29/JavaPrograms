package oopsPgm;

import java.time.LocalDateTime;

public class CompanyShares {
    private String symbol;
    private int shares;
    private LocalDateTime dateTime;

    public CompanyShares(String symbol, int shares) {
        this.symbol = symbol;
        this.shares = shares;
        this.dateTime = LocalDateTime.now();
    }

    public String getSymbol() { return symbol; }
    public int getShares() { return shares; }

    public void addShares(int n) { this.shares += n; }
    public void removeShares(int n) { this.shares -= n; }
}
