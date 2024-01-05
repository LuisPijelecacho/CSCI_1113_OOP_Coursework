public class SavingsAccount extends Account{

    public SavingsAccount() {
    }

    public SavingsAccount(double balance) {
        super(balance);
    }


    public void accountOverdrawn(){
        if (balance < 1) {
            System.out.println("Your account has been overdrawn!");
        }
    }
    @Override
    public String toString(){
        return "In this savings account of ID: " + getiD() + " was created on " + getDateCreated() + "\nYou have a balance of: $" + getBalance()
                + "\nYour monthly interest is: " + getMonthlyInterest() + "\nYour annual interest rate is: " + getAnnualInterestRate()
                + "\nThis account can not be overdrawn, if you attempt to do so you will receive a message stating so";
    }
}
