package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static int minutes = 100;
    static double costOverage = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       //initialize what we know


        //get what we don't know
        int minutesUsed = getMinutesValue();
        scanner.close();
        
        //
        int overage = calculateLimitOverage(minutes, minutesUsed);

        double bill = bill(overage, costOverage);

        double taxes = taxValue(bill, tax);

        if (minutesUsed>minutes) {
            System.out.println("Your minutes overage is: " + overage + "min");
            System.out.println("Your mobile phone bill is: " + bill + "$");
            System.out.println("Your taxes is: " + taxes + "$");
        } else {
            System.out.println("You hadn't overage the limit of minutes in this month");
        }
    }

    public static int calculateLimitOverage(int minutes, int minutesUsed) {
        int overage = minutesUsed - minutes;
        return overage;
    }

    public static int getMinutesValue() {
        System.out.println("Enter value of used minutes:");
        int minutesUsed = scanner.nextInt();

        return minutesUsed;
    }

    public static double bill(int overage, double costOverage){
        double bill = overage * costOverage;
        return bill;
    }

    public static double taxValue(double bill, double tax){
        tax = bill * tax;
        return tax;
    }


}
