import java.util.ArrayList;
import java.util.List;

public class Account {

    // we make these fields private so that other class dont access them
    private int baln;
    private List<String> transactionHistory;

    public Account() {
        this.baln = 0;
        this.transactionHistory = new ArrayList<>();
    }

    // to deposit money into amount
    public void deposit(int amount) {

        // to check if our amount is correct or not
        if (Validation.isPositive(amount)) {
            // we add our amount to our bank balance
            baln = baln + amount;

            // message to user
            System.out.println("Amount successfully deposited.\nCurrent balance: " + baln + "rs");

            // to maintain history
            addTransaction("Deposited: " + amount + "rs.\n Current amount: " + baln + "rs");
        }
    }

    // to withdraw money from account
    public void withdraw(int amount) {

        // to check if our amount is correct or not
        if (Validation.isPositive(amount)) {

            // 1st we check if our amount has sufficient balance or not
            if (amount <= baln) {
                baln = baln - amount;

                // message to user
                System.out.println("Amount successfully withdrawn.\nCurrent balance: " + baln);

                // to maintain history
                addTransaction("Withdrawn: " + amount + "rs.\n Current amount: " + baln + "rs");
            } else {

                // transaction failed
                System.out.println("Not sufficient balance!!!");
            }
        }
    }

    // to add transaction for reviewing
    public void addTransaction(String transactionMsg) {

        // we add transaction into the list with a message
        transactionHistory.add(transactionMsg);
    }

    // to get balance
    public int getBalance() {
        return baln;
    }

    // to get whole transactional history
    public List<String> getTransactionHistory() {
        return transactionHistory;
    }
}
