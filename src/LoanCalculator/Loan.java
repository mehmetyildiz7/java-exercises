package LoanCalculator;

/**
 * Created by Mehmet on 27.9.2017.
 */

import java.util.Scanner;

public class Loan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, e.g., 7,25% : ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter the number of years, e.g., 5 : ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter the amount of loan, e.g., 135000,5 : ");
        double loanAmount = input.nextDouble();

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow(1 + monthlyInterestRate,numberOfYears * 12))));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is : $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is : $" + (int)(totalPayment * 100) / 100.0);
    }

}
