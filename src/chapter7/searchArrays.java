package chapter7;

import java.util.Arrays;
import java.util.Random;

public class searchArrays {

    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);

    }

    public static int[] generateNumbers() {

        int[] tiket = new int[LENGTH];

        Random random = new Random();

        for (int i=0; i<LENGTH; ++i){

            int randomNumber;

//          Generate random number then search to make sure it doesn't already
//            exist in the array. If it does, regenerate and search again.
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(tiket, randomNumber));

//          Number is unique if we get here. Add it to the array.
            tiket[i] = randomNumber;
        }

        return tiket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search for
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){

        //Enhanced loop: It iterates through "array" and each time assign the current
//      element to "value"
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        /*
        If we've reached this point, then the entire array was searched and the value
        wasn't found
         */
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {
//        Arrays must be sort first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0) {
            return true;
        } else return false;
    }

    public static void printTicket(int ticket[]) {
        for (int i=0; i<LENGTH; ++i){
            System.out.print(ticket[i] + " | ");
        }
    }
}
