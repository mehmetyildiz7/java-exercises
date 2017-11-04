package AreaOfTriangle;
import java.util.Scanner;
/**
 * Created by Mehmet on 4.11.2017.
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
        double s,side1,side2,side3,x1,x2,x3,y1,y2,y3,area;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 points for the triangle : "); // with the format of : x1 y1 x2 y2 x3 y3

        x1 = input.nextDouble();
        y1 = input.nextDouble();

        x2 = input.nextDouble();
        y2 = input.nextDouble();

        x3 = input.nextDouble();
        y3 = input.nextDouble();

        side1 = Math.pow( Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2) , 0.5 );
        side2 = Math.pow( Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2) , 0.5 );
        side3 = Math.pow( Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2) , 0.5 );
        s = (side1 + side2 + side3) / 2;
        area = Math.pow( s * (s - side1) * (s - side2) * (s - side3) , 0.5);

        System.out.println("Area of the triangle is : " + area);
    }

}
