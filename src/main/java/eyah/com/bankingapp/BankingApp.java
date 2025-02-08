package eyah.com.bankingapp;

/**
 *
 * @author Elleah Kim 2024
 */

import java.util.*;

public class BankingApp {

    public static void main(String[] args) {
        String cont = "yes";
        float balance = 0;
        //System.out.println("Welcome to Eyyyaahboobank!");

        try (Scanner scan = new Scanner(System.in)) {
            while (cont.equalsIgnoreCase("yes")) {
                System.out.println("--------------------------------------------------------");
                System.out.println("Please choose a transaction:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Balance Check");
                System.out.print("Enter your choice: ");
                
                int transaction = scan.nextInt();
                
                switch (transaction) {
                    case 1 -> {
                        System.out.print("Please enter the amount to withdraw: ");
                        float withdraw = scan.nextFloat();
                        if(balance-withdraw > 0){
                            balance-=withdraw;
                            System.out.println("Transaction Successful");
                            System.out.println("Your new account balance is: " + balance);
                        }else{
                            System.out.println("Withdraw amount is below your balance, please input minimum amount.");
                        }
                        break;
                    } 
                    case 2 -> {
                         System.out.print("Please enter the amount to deposit: ");
                         float deposit = scan.nextFloat();
                         balance+=deposit;
                         System.out.println("Transaction Successful");
                         System.out.println("Your new account balance is: " + balance);
                         break;
                    } 
                    case 3 -> System.out.println("Your balance is: " + balance);
                    default -> System.out.println("Invalid choice. Please try again.");
                }
                
            
                System.out.print("Do you have another transaction? (yes/no): ");
                scan.nextLine();
                cont = scan.nextLine().trim();
            }   System.out.println("Thank you for banking with us!");
        }
    }
}

