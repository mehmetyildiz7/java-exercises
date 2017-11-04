package BMICalculation;
import java.util.Scanner;
/**
 * Created by Mehmet on 4.11.2017.
 */
public class BMI {

    public static void main(String[] args) {
        double weight,height,BMI;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in kilograms : ");
        weight = input.nextDouble();
        System.out.print("Enter the height in meters : ");
        height = input.nextDouble();
        BMI = weight / Math.pow(height,2);

        System.out.println("BMI is : " + BMI);

    }

}
