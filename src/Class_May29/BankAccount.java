package Class_May29;

public class BankAccount {

    private double balance;
    BankAccount (double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney(double depositAmount){
        balance = balance + depositAmount;
    }

    public void withdrawMoney(double withdrawAmount){
        balance = balance - withdrawAmount;
    }
}
