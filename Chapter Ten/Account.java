import java.util.Date;

public class Account {

    private double balance = 0;
    private double annualInterestRate = 0;
    Date dateCreated = new Date();
    Account(){
        this.balance = 100;

    }
    Account(double balance){
        this.balance = balance;
    }


    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    //populate the following methods
    public double getMonthlyInterestRate(){
        return (this.annualInterestRate / 12) / 100;
    }
    public double getMonthlyInterest(){
        return this.balance * getMonthlyInterestRate();
    }
    public double withdraw (double amount){
        this.balance -= amount;
        return amount;
    }
    public double deposit(double amount){
        this.balance += amount;
        return amount;
    }
}
