import java.util.*;

public class PaymentList implements TransactionList {
    
    private ArrayList<Transaction> transactions;


    public PaymentList(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Transaction getLastTransaction() {
        return transactions.get(transactions.size() -1);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);

    }

    public Transaction getTransactionByDate(String date) {
        for (Transaction transaction : transactions) {
            if (transaction.getDate().equals(date)) {
                return transaction;
            }
        }
        return null;
    }

    public ArrayList<Transaction> getAllTransactions() {
        return transactions;
    }
}
