package oopsPgm;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
            System.out.println("Amount debited successfully.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
