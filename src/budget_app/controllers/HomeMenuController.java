package budget_app.controllers;
import budget_app.services.BudgetCalculations;

import java.util.Scanner;

public class HomeMenuController {
    public static void main(String[] args) {

        BudgetCalculations runCalculations = new BudgetCalculations();
        runCalculations.run();

        System.out.println("Welcome to your Budgeting App!");
        System.out.println("Please select your menu option below to proceed: \n " +
                "1) View Overview Stats \n " +
                "2) Create/View Custom Goals \n " +
                "3) Customize Budget (add/update/delete income/expenses) \n " +
                "4) Run Customized Reports \n " +
                "5) Exit \n" +
                "Select 1-5: ");
        Scanner input = new Scanner(System.in); // create scanner
        int userInput = input.nextInt();
        while(userInput != 5) {

            if (userInput == 1) {
                OverviewStats stats = new OverviewStats();
                stats.checkingAccountBalance();

                System.out.println("Please select a new option: ");
                userInput = input.nextInt();

            } else if (userInput == 2) {
                goals();
                System.out.println("Please select a new option: ");
                userInput = input.nextInt();

            } else if (userInput == 3) {
                System.out.println("You chose #3");
                //CustomizeBudget();
                System.out.println("Please select a new option: ");
                userInput = input.nextInt();

            } else if (userInput == 4) {
                System.out.println("You chose #4");
                reports();
                System.out.println("Please select a new option: ");
                userInput = input.nextInt();
            }
            else {
                System.out.println("Please choose 1-5. Select your option: ");
                userInput = input.nextInt();
            }
        }
        System.out.println("Goodbye!");
    }

    public static void overviewStats(){

        int checkingBalance = 0;
        int savingsBalance = 0;
        int savingPerMonth = 0;

        System.out.println("1) View Overview Stats \n " +
                "-------------------------- \n" +
                "Checking account balance: $" + checkingBalance + "\n " +
                "Savings account balance is: $" + savingsBalance + "\n " +
                "You are currently saving $" + savingPerMonth + " per month \n");
    }

    public static void goals(){
        /*
        Would you like to view existing goals (yes/no). You can type "return" to go back to the home menu.

        Great

        I see you have one existing goal defined:
        -----------------------
        Goal Name: xxx
        Goal Amount:
        Amount Saved:
        Amount Remaining:
        ------------------------
        Would you like to create another goal? (yes/no). You can type "return" to go back to the home menu.
         */
        String goalName;
        int goalAmount;
        int amountSaved;
        int amountRemaining;
    }

    public static void reports(){
        /*
        Which report would you like to run? (type "return" to return to the home menu)
        1) Debt overview
        2) Savings Overview
        3) Spending and Savings Recommendations
        4) Financial Sanity Report
        -----------------------
        Savings Overview:
        Total saved this year:
        Total saved this month:
        Ratio of income saved:
         */
    }
}
