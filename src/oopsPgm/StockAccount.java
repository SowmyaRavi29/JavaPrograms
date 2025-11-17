package oopsPgm;

import java.util.ArrayList;
import java.util.List;

public class StockAccount {

    private List<CompanyShares> companyShares = new ArrayList<>();

    public void buy(String symbol, int shares) {
        for (CompanyShares cs : companyShares) {
            if (cs.getSymbol().equals(symbol)) {
                cs.addShares(shares);
                System.out.println("Added shares to existing company.");
                return;
            }
        }
        companyShares.add(new CompanyShares(symbol, shares));
        System.out.println("New company shares added.");
    }

    public void sell(String symbol, int shares) {
        for (CompanyShares cs : companyShares) {
            if (cs.getSymbol().equals(symbol)) {
                if (cs.getShares() >= shares) {
                    cs.removeShares(shares);
                    System.out.println("Shares sold.");
                } else {
                    System.out.println("Not enough shares to sell.");
                }
                return;
            }
        }
        System.out.println("Company not found.");
    }

    public void printReport() {
        System.out.println("\n----- Company Shares Report -----");
        for (CompanyShares cs : companyShares) {
            System.out.println("Symbol: " + cs.getSymbol() +
                    " | Shares: " + cs.getShares());
        }
    }
}
