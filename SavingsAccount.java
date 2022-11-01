
public class SavingsAccount extends Account{
    protected double Overdraft_Limit = 0;

    public SavingsAccount(int iD, double balance) {
        super(iD, balance);
    }

    @Override
    public void withdraw(double amount){
        if(balance - amount >= Overdraft_Limit){
            super.withdraw(amount);
        }
    }

    @Override
    public String toString(){
        return "SavingsAccount{" + "balance: " + balance + '}';
    }
}
