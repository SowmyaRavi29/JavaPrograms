package oopsPgm;

public class AccountTest {
    public static void main(String[] args) {

        Account acc = new Account(5000);

        acc.debit(3000);
        System.out.println("Balance: " + acc.getBalance());

        acc.debit(3000);  // Exceeds
        System.out.println("Balance: " + acc.getBalance());
    }
}
