/*
*TrevorApp.java
* This is the main class.
* @author Trevor Ngcobo
* 05 February 2022
*
* This is a budgeting app
 */

package za.ac.cput.trevor;

import java.util.Scanner;

public class TrevorApp
{
    public  Expense readAllExpenses()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("This is a budgeting application. Enter your monthly spend.");
        System.out.println("*************************************");

        System.out.println("How much do you spend on groceries?");
        double grocery = scn.nextDouble();
        System.out.println("How much do you spend on utilities (electricity and water) ?");
        double utilities = scn.nextDouble();
        System.out.println("How much do you save? ");
        double save = scn.nextDouble();
        System.out.println("How much do you spend on transportation? ");
        double transport = scn.nextDouble();
        System.out.println("How much do you spend on entertainmnent? ");
        double entertainment = scn.nextDouble();

        System.out.println("Is there anything else? (Y/N)");
        String anythingElse = scn.next();
        double additionalExpenseRands = 0;
        String additionalExpense = null;

        while(true)
        {
            if (anythingElse.equalsIgnoreCase("Y")) {
                System.out.println("Please enter additional expense: ");
                additionalExpense = scn.next();
                System.out.println("How much do you spend on " + additionalExpense + "?");
                additionalExpenseRands = scn.nextDouble();

                break;
            } else if (anythingElse.equalsIgnoreCase("N")) {
                System.out.println("Great!");
                break;
            } else {
                System.out.println("Enter Y or N please");
                anythingElse = scn.next();
            }
        }
        Expense obj = new Expense(grocery, utilities, transport, save, entertainment,additionalExpenseRands, additionalExpense);
        displayExpenses(obj);
        return obj;
    }

    public static double totalExpenses(Expense e)
    {
        double sumOfExpenses =0;
        double grocery = e.getGrocery();
        double utilities = e.getUtilities();
        double transport = e.getTransport();
        double entertainment = e.getTransport();
        double additionalExpense = e.getAdditionalExpenseRands();
        System.out.println("Your total expenses are: "+ sumOfExpenses);

        return sumOfExpenses = grocery + utilities + transport + entertainment + additionalExpense;
    }

    public static void displayExpenses(Expense e)
    {
        System.out.println(e.toString());

    }
    public static double income()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("What is your monthly income?");
        double income = scn.nextDouble();
        System.out.println("========================================");
        System.out.println("Your income is: " + income);

        return income;
    }

    public double disposableIncome(double income, double expenses)
    {
        double disposableIncome = income - expenses;
        System.out.println("========================================");
        System.out.println("Your disposable income is : " + disposableIncome);
        return disposableIncome;
    }

    public static void main(String[] args)
    {
        double totalExpense = totalExpenses(new TrevorApp().readAllExpenses());
        double income = income();
        new TrevorApp().disposableIncome(income, totalExpense);


    }

}
