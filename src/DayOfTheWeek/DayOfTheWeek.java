package DayOfTheWeek;
import java.util.Scanner;

/**
 * Created by Mehmet on 5.11.2017.
 */
public class DayOfTheWeek {

    public static void main(String[] args) {

        String[] days = new String[]{"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        Scanner input = new Scanner(System.in);

        int weekDayIndex,dayOfTheMonthIndex,monthIndex,century,yearOfCentury;
        System.out.print("Enter the year, eg. 2015 : ");
        int year = input.nextInt();
        System.out.print("Enter the month : 1-12 : ");
        monthIndex = input.nextInt();
        if(monthIndex <= 2){
            monthIndex += 12;
            year -= 1;
        }

        System.out.print("Enter the day of the month : 0-31 : ");
        dayOfTheMonthIndex = input.nextInt();

        century = year / 100;
        yearOfCentury = year % 100;

        weekDayIndex = ( dayOfTheMonthIndex + (26 * (monthIndex + 1)) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century ) % 7;
        System.out.println(weekDayIndex);
        System.out.println("Day of the week is " + days[weekDayIndex]);
    }

}
