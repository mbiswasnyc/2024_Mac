package Classes;

public class SavingsAccount extends Account{
    SavingsAccount(int accountNumber, String name) {
        super(accountNumber, name);
    }
    int withdrawLimit=3;
    int withdrawCount=1;
    public void withdrawMoney(double withdrawAmount){
        if(getBalance()>withdrawAmount && withdrawCount<=withdrawLimit){
            setBalance(getBalance()-withdrawAmount);
            withdrawCount++;
        }else{
            System.out.println("too much try");
        }
            /*{
            if(getBalance()<withdrawAmount){
                System.out.println("You can withdraw up to "+getBalance()+" at this time");
            } else if (withdrawCount>withdrawLimit) {
                System.out.println("Sorry ! You used all of your withdraw for today");
            }
        }*/
    }

    public void addInterest(double interestAmount){
        double savingBalance = getBalance()+interestAmount;
        //balance2=balance2+interestAmount;
        setBalance(savingBalance);
    }

    public void addInterestPercentage(double interestPercentage){
        double savingBalance = getBalance()+(getBalance()*(interestPercentage/100));
        //balance2=balance2+interestAmount;
        setBalance(savingBalance);
    }
}
