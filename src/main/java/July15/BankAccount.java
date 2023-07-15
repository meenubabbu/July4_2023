package July15;

public class BankAccount {
    String accountholdername;
    double checkingaccount;
    double savingsaccount;

    //static double totalmoney=0;
   //double amount;

    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }

    public double addmoneytochecking(int amount)
    {
        checkingaccount+=amount;
        return checkingaccount;
    }

    public double getSavingsaccount() {
        return savingsaccount;
    }
}
