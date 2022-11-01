import java.util.ArrayList;
import java.util.Date;

public class Account {
    protected String Name;
    protected int ID;
    protected double balance;
    protected double AnnualInterestRate;
    protected Date DateCreated;
    protected ArrayList <Transaction> Transactions;

    public Account(){
        DateCreated = new Date();
        Transactions = new ArrayList<>();
    }

    public Account(int ID, double balance) {
        this();
        ID = ID;
        balance = balance;
    }

    public Account(String name, int iD, double balance) {
        this(iD, balance);
        Name = name;
    }
        
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public double getMonthlyInterestRate(){
        return balance * (AnnualInterestRate / 12) / 100;
    }

    public void withdraw(double amount) {
        Transactions.add(new Transaction('W', amount, balance, "withdraw"));
        balance -= amount;
    }

    public void deposit(double amount){
        Transactions.add(new Transaction('D', amount, balance, "deposit"));
        balance += amount;
    }

    @Override
    public String toString(){
        return "Account name: " + Name + "\n" + "Interest Rate: " + AnnualInterestRate + "\n" + Transactions;  
    }

    public ArrayList<Transaction> getTransactions(){
        return new ArrayList<>(Transactions);
    }

}
