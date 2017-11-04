package TotalSavingsAfter6Month;
import java.util.Scanner;

/**
 * Created by Mehmet on 4.11.2017.
 */
public class TotalSavings {

    public static void main(String[] args) {

        double annualInterestRate,monthlyInterestRate,monthlySavingAmount,totalSavings = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount : ");
        monthlySavingAmount = input.nextDouble();

        System.out.print("Enter the annual interest rate, eg. 3,75 : ");
        annualInterestRate = input.nextDouble();
        monthlyInterestRate = annualInterestRate / (100 * 12);

        for(int i = 0;i < 6 ; i++){
            totalSavings += monthlySavingAmount;
            totalSavings = totalSavings * (1 + monthlyInterestRate);
        }

        System.out.println("Total savings after 6 months : " + totalSavings);

    }

}
