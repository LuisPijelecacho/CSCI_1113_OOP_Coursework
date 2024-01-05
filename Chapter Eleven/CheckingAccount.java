public class CheckingAccount extends Account{


    double overdraftLimit = 100;
    public CheckingAccount(){

    }

    public CheckingAccount(double balance){
        super(balance);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public String toString(){
        return "In this checking account of ID: " + getiD() + " was created on " + getDateCreated() + "\nYou have a balance of: $" + getBalance()
                + "\nYour monthly interest is: " + getMonthlyInterest() + "\nYour annual interest rate is: " + getAnnualInterestRate()
                + "\nYour overdraft limit is set to: $" + getOverdraftLimit() + " above your account balance.";
    }
}
