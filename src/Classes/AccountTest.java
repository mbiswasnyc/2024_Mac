package Classes;

public class AccountTest {
    public static void main(String[] args) {
  /*      Account account = new Account();

        account.setAccountNumber(1234);
        account.depositMoney(500);
        System.out.println(account.getBalance());
        account.withdrawMoney(450);*/

        SavingsAccount sAccount = new SavingsAccount(123, "Joy");
        sAccount.setBalance(500);
        System.out.println("Balance is : "+sAccount.getBalance());
        System.out.println("________________");

        //Withdraw limit
        sAccount.withdrawMoney(20);
        System.out.println(sAccount.getBalance());
        sAccount.withdrawMoney(20);
        System.out.println(sAccount.getBalance());
        sAccount.withdrawMoney(20);
        System.out.println(sAccount.getBalance());
        sAccount.withdrawMoney(20);
        System.out.println(sAccount.getBalance());

        // Interest percentage
        sAccount.addInterestPercentage(7);
        System.out.println("Balance + InterestPercentage is : "+sAccount.getBalance());

    }
}
