package chapter3;

import java.util.Scanner;

public class ChangeForADollar {

    public static void main(String[] args) {

        int fifth = 5;
        int tens = 10;
        int quorters = 25;
        int halfs = 50;
        int dollar = 100;

        System.out.println("Enter number of 5 cent coins:");
        Scanner scanner = new Scanner(System.in);
        fifth = fifth * scanner.nextInt();

        System.out.println("Enter number of 10 cent coins:");
        tens = tens * scanner.nextInt();

        System.out.println("Enter number of 25 cent coins:");
        quorters = quorters * scanner.nextInt();

        System.out.println("Enter number of 50 cent coins:");
        halfs = halfs * scanner.nextInt();

        int sum = fifth + tens + quorters + halfs;

        int delta = sum - dollar;

        if(sum == dollar) {
            System.out.println("You win! You have 1 dollar!");
            if(sum > dollar) {
                System.out.println("You went over " + delta);
            }
        }
        else{
            System.out.println("You give " + delta + " dollar less");
        }
    }
}
