package MultiplyDigits;

import java.util.Scanner;

/**
 * Created by Mehmet on 4.11.2017.
 */
public class MultiplyDigits {

    public static void main(String[] args) {

        int number,digit1 = 1,digit2 = 1,digit3;

        do{
            System.out.print("Enter a number between 0-999 : ");
            Scanner input = new Scanner(System.in);

            number = input.nextInt();
            if(number >= 0 && number <=999){

                if((number / 100) != 0){
                    digit1 = number / 100;
                }
                if((number / 10) != 0){
                    digit2 = (number % 100) / 10;
                }
                digit3 = number % 10;

                System.out.println("The multiplication of digits equals to : " + digit1 * digit2 * digit3);
            }

        }while(number < 0 || number > 999);



    }

}
