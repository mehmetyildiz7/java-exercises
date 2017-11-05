package ComputeTax;
import java.util.Scanner;
/**
 * Created by Mehmet on 5.11.2017.
 */
public class ComputeTax {

    public static void main(String[] args) {

        double totalTax = 0,taxableIncome;
        int status; // 0 : Single , 1 : Married Filing Jointly or Qualifying Widow(er) , 2 : Married Filing Separately , 3 : Head of Household

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the taxable income : ");
        taxableIncome = input.nextDouble();

        System.out.print("0 : Single\n1 : Married Filing Jointly or Qualifying Widow(er)\n2 : Married Filing Separately\n3 : Head of Household\n");
        System.out.print("Enter the status : ");
        status = input.nextInt();

        if(status == 0){
            if(taxableIncome >= 0 && taxableIncome <= 8350){
                totalTax = taxableIncome * 0.10;
            }
            else if(taxableIncome > 8350 && taxableIncome <= 33950){
                totalTax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            }
            else if(taxableIncome > 33950 && taxableIncome <= 82250){
                totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            }
            else if(taxableIncome > 82250 && taxableIncome <= 171550){
                totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            }
            else if(taxableIncome > 171550 && taxableIncome <= 372950){
                totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (taxableIncome - 171550) * 0.33;
            }
            else{
                totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }

        else if(status == 1){
            if(taxableIncome >= 0 && taxableIncome <= 16700){
                totalTax = taxableIncome * 0.10;
            }
            else if(taxableIncome > 16700 && taxableIncome <= 67900){
                totalTax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            }
            else if(taxableIncome > 67900 && taxableIncome <= 137050){
                totalTax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25;
            }
            else if(taxableIncome > 137050 && taxableIncome <= 208850){
                totalTax = 16700 * 0.10 + (67950 - 16700) * 0.15 + (137050 - 67950) * 0.25 + (taxableIncome - 137050) * 0.28;
            }
            else if(taxableIncome > 208850 && taxableIncome <= 372950){
                totalTax = 16700 * 0.10 + (67950 - 16700) * 0.15 + (137050 - 67950) * 0.25 + (208850 - 137050) * 0.28 + (taxableIncome - 208850) * 0.33;
            }
            else{
                totalTax = 16700 * 0.10 + (67950 - 16700) * 0.15 + (137050 - 67950) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }

        else if(status == 2){
            if(taxableIncome >= 0 && taxableIncome <= 8350){
                totalTax = taxableIncome * 0.10;
            }
            else if(taxableIncome > 8350 && taxableIncome <= 33950){
                totalTax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            }
            else if(taxableIncome > 33950 && taxableIncome <= 68525){
                totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
            }
            else if(taxableIncome > 68525 && taxableIncome <= 104425){
                totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (taxableIncome - 68825) * 0.28;
            }
            else if(taxableIncome > 104425 && taxableIncome <= 186475){
                totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68825) * 0.28 + (taxableIncome - 104425) * 0.33;
            }
            else{
                totalTax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68825) * 0.28 + (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
            }
        }

        else if(status == 3){
            if(taxableIncome >= 0 && taxableIncome <= 11950){
                totalTax = taxableIncome * 0.10;
            }
            else if(taxableIncome > 11950 && taxableIncome <= 45500){
                totalTax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
            }
            else if(taxableIncome > 45500 && taxableIncome <= 117450){
                totalTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
            }
            else if(taxableIncome > 117450 && taxableIncome <= 190200){
                totalTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
            }
            else if(taxableIncome > 190200 && taxableIncome <= 372950){
                totalTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (taxableIncome - 190200) * 0.33;
            }
            else{
                totalTax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
            }
        }

        System.out.println("Total tax is = " + totalTax);
    }
}
