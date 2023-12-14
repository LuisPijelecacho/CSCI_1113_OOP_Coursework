import java.util.Date;

public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    Date dateCreated = new Date();
    Account(){

    }
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }


    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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
