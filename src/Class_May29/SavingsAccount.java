package Class_May29;

public class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }
    public void withdrawMoney(double withdrawAmount) {
        if((getBalance()-withdrawAmount)>100){
            setBalance(getBalance()-withdrawAmount);
        }else{
            System.out.println("Low balance");
        }
    }
}
