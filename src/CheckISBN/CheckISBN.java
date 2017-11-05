package CheckISBN;
import java.util.Scanner;

/**
 * Created by Mehmet on 5.11.2017.
 */
public class CheckISBN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String digits = input.next();

        int[] d = new int[9];
        for(int i = 0;i < 9 ;i++){
            d[i] = Integer.parseInt(String.valueOf(digits.charAt(i)));
        }

        int digit10 = (d[0] * 1 + d[1] * 2 + d[2] * 3 + d[3] * 4 + d[4] * 5 + d[5] * 6 + d[6] * 7 + d[7] * 8 + d[8] * 9) % 11;

        System.out.print("The ISBN-10 number is " + digits);
        if(digit10 == 10) System.out.println("X");
        else System.out.println(digit10);


    }

}
