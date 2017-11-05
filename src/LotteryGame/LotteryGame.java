package LotteryGame;
import java.util.Scanner;

/**
 * Created by Mehmet on 5.11.2017.
 */
public class LotteryGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 1000);
        String randomNumberString = String.valueOf(randomNumber);
        if(randomNumberString.length() == 2)
            randomNumberString = "0" + randomNumberString;
        else if(randomNumberString.length() == 1)
            randomNumberString = "00" + randomNumberString;
        System.out.println(randomNumberString);


        System.out.print("Enter a three-digit number : ");
        String userInput = input.next();

        if(userInput.length() == 1)
            userInput = "00" + userInput;
        else if(userInput.length() == 2)
            userInput = "0" + userInput;

        if(userInput.equals(randomNumberString))
            System.out.println("Congratulations! Your award is $12.000");
        else{
            int digitMatchCount = 0;

            for(int i = 0;i < 3;i++)
                for(int j = 0;j < randomNumberString.length();j++)
                    if(userInput.charAt(i) == randomNumberString.charAt(j)){
                        digitMatchCount++;
                        randomNumberString = new StringBuilder(randomNumberString).deleteCharAt(j).toString();
                        break;
                    }

            if(digitMatchCount == 3)
                System.out.println("Congratulations! Your award is $5.000");
            else if(digitMatchCount >= 1)
                System.out.println("Congratulations! Your award is $2.000");
        }


    }

}
