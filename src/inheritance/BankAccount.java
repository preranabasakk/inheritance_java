package inheritance;

public class BankAccount {
    public String accountHolder;
    private int balance;

    public BankAccount(String accountHolder, int balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(){
        System.out.println("deposited");
    }
    public void withdraw(){
        System.out.println("withdrawn");

    }

}
