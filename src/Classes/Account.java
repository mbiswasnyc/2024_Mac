package Classes;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private String phone;
    private String email;

    Account(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

   /* public Account() {

    }*/

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }


    public void depositMoney(double depositAmount){

        balance = balance + depositAmount;
    }


    public void withdrawMoney(double withdrawAmount){
        if(withdrawAmount<=balance){
            balance = balance - withdrawAmount;
        }else {
            System.out.println("you are broke");
            System.out.println("You can withdraw up to : "+balance);
        }

    }
}
