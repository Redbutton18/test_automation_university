package chapter7;

import java.util.Scanner;

public class usefulTricksArrays {
    
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];
        
        getGrades();

        System.out.println("Average: " + String.format("%.2f", average()));
        System.out.println("Highest: " + highest());
        System.out.println("Lowest: " + lowest());
    }

    public static void getGrades() {
        for (int i=0; i<grades.length; ++i){
            System.out.println("Enter grade # " + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculatedSum() {
        int sum = 0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static double average() {
        return calculatedSum()/grades.length;
    }

    public static int highest() {
        int highest = grades[0];
        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int lowest() {
        int lower = grades[0];
        for(int grade : grades){
            if(grade < lower){
                lower = grade;
            }
        }
        return lower;
    }
}
