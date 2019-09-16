package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day: " );
        int day = scanner.nextInt();

        System.out.println("You enter number: " + day + "," + " it's equals to: " + getDay(day));
    }

    public static String getDay(int day) {
        switch (day){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid day. Please enter a value between 1 and 7";
        }
    }
}
