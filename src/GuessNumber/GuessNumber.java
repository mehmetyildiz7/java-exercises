package GuessNumber;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        int userInput,guessCount = 1;

        while(true){

            System.out.print("Enter your guess : ");
            userInput = input.nextInt();

            if(userInput == randomNumber){
                System.out.println("Yes, the number is " + randomNumber + "\nYou guessed it correct in " + guessCount + ". try!");
                break;
            }
            else if(userInput < randomNumber)
                System.out.println("Your guess is too low!");
            else if(userInput > randomNumber)
                System.out.println("Your guess is too high!");

            guessCount++;
        }

    }

}
