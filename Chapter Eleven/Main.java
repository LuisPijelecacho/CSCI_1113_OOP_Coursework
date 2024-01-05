public class Main {
    public static void main (String[] args){

        Account regularAccount = new Account(100);
        CheckingAccount checking = new CheckingAccount(235);
        SavingsAccount savings = new SavingsAccount(100);

        System.out.println(regularAccount.toString());
        System.out.println(checking.toString());
        System.out.println(savings.toString());
    }

}
