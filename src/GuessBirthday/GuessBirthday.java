package GuessBirthday;

import java.util.Scanner;


public class GuessBirthday {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 0;
        String setsOfDays[] = new String[5];
        setsOfDays[0] = " 1  3  5  7\n" +
                        " 9 11 13 15\n" +
                        "17 19 21 23\n" +
                        "25 27 29 31\n";

        setsOfDays[1] = " 2  3  6  7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31\n";

        setsOfDays[2] = " 4  5  6  7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31\n";

        setsOfDays[3] = "8 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31\n";

        setsOfDays[4] = "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31\n";

        for (int i = 0; i < 5;i++){
            System.out.println("Is your birtday in set" + i + " ;");
            System.out.println(setsOfDays[i]);
            System.out.print("Answer \"1\" for Yes and \"0\" for No : ");
            int answer = input.nextInt();

            if(answer == 1){
                if(i == 0)
                    day += 1;
                else if(i == 1)
                    day += 2;
                else if(i == 2)
                    day += 4;
                else if(i == 3)
                    day += 8;
                else if(i == 4)
                    day += 16;
            }
        }

        System.out.println("Your born on " + day + ". day of the month.");
    }

}
