public class Transaction {
    private int sellerAccountNumber;
    private int buyerAccountNumber;
    private double amount;
    private String date;


    public Transaction(int sellerAccountNumber, int buyerAccountNumber, double amount, String date) {
        this.sellerAccountNumber = sellerAccountNumber;
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date;
    }

    public int getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(int sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public int getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public void setBuyerAccountNumber(int buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
