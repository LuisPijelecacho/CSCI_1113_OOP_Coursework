import java.util.Date;

public class Account {

    private int iD;
    public double balance = 0;
    private double annualInterestRate = 0;
    Date dateCreated = new Date();
    Account(){

    }
    Account(double balance){
        this.balance = balance;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
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
    public void withdraw (double amount){
        this.balance -= amount;

    }
    public void deposit(double amount){
        this.balance += amount;

    }
    public String toString(){
        return "In this account of ID: " + getiD() + " was created on " + getDateCreated() + "\nYou have a balance of: $" + getBalance()
                + "\nYour monthly interest is: " + getMonthlyInterest() + "\nYour annual interest rate is: " + getAnnualInterestRate();
    }
}
