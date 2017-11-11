package TrianglePrint;
import java.util.Scanner;

public class TrianglePrint {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int lineCount;

        System.out.print("Enter the number of lines : ");
        lineCount = input.nextInt();

        for(int i = lineCount;i >= 1;i--){
            for(int j = i;j > 0;j--)
                System.out.printf("%2d ",j);
            for(int k = 2;k <= i;k++)
                System.out.printf("%2d ",k);
            System.out.println("");
        }


    }

}
