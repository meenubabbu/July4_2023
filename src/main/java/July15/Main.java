package July15;

public class Main {
    public static void main(String[] args) {
        System.out.println(Methodoverload.overloadname(15));
        System.out.println(Methodoverload.overloadname("Anubha"));

        //BankAccount
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountholdername="Anubha";
        bankAccount.checkingaccount=1000.00;
        bankAccount.savingsaccount=10.00;
        System.out.println( bankAccount.addmoneytochecking(100));
        System.out.println(bankAccount.getSavingsaccount());
        bankAccount.setAccountholdername("Anu");
        System.out.println(bankAccount.accountholdername);
    }

}
