package Class_May29;

public class BankAccountTest{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(600);
        savingsAccount.withdrawMoney(499);
        System.out.println(savingsAccount.getBalance());
    }
}
