package PointInCircle;
import java.util.Scanner;
/**
 * Created by Mehmet on 5.11.2017.
 */
public class PointInCircle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x1,y1;

        System.out.print("Enter a point with two coordinates : ");
        x1 = input.nextInt();
        y1 = input.nextInt();

        double distance = Math.pow( Math.pow(0 - x1,2) + Math.pow(0 - y1,2) , 0.5 );

        if(distance <= 10){
            System.out.println("Point (" + x1 + ", " + y1 + ") is in the circle.");
        }
        else{
            System.out.println("Point (" + x1 + ", " + y1 + ") is not in the circle.");
        }
    }

}
