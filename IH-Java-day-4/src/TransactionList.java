import java.util.*;

public interface TransactionList {
    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(String date);
    ArrayList<Transaction> getAllTransactions();
}
