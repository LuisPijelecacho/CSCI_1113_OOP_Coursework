import java.util.Scanner;

public class AccountTest {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        Account[] accounts = new Account[10];

        for(int i = 0; i < 10; i++){
            accounts[i] = new Account();
        }

        System.out.print("Enter ID: ");
        int userID = input.nextInt();

        if (userID < 0 || userID > 9){
            System.out.print("Invalid ID! \nPlease eneter valid ID: ");
            userID = input.nextInt();
        }

        System.out.println("Choose an action you would like to perform.\n 1) Current Balance\n 2) Withdraw\n 3) Deposit\n 4) Exit");
        int menuPrompt = input.nextInt();

        double withdrawAmount = 0;
        double depositAmount = 0;

        while(menuPrompt != 4){
            switch (menuPrompt) {
                case 1:
                    System.out.print("Here is your current balance: $" + accounts[userID].getBalance());
                    System.out.println();
                    System.out.println("-----------------------");
                    break;
                case 2:
                    System.out.print("How much would you like to withdraw? $");
                    withdrawAmount = input.nextDouble();
                    accounts[userID].withdraw(withdrawAmount);
                    System.out.println();
                    System.out.println("-----------------------");
                    break;
                case 3:
                    System.out.print("How much would you like to deposit? $");
                    depositAmount = input.nextDouble();
                    accounts[userID].deposit(depositAmount);
                    System.out.println();
                    System.out.println("-----------------------");
                    break;

            }
            System.out.println("Choose an action you would like to perform.\n 1) Current Balance\n 2) Withdraw\n 3) Deposit\n 4) Exit");
            menuPrompt = input.nextInt();
            withdrawAmount = 0;
            depositAmount = 0;

        }


    }
}
