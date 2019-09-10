package chapter7;

import java.util.Random;

public class lotteryTicket {

    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers() {

        int[] tiket = new int[LENGTH];

        Random random = new Random();

        for (int i=0; i<LENGTH; ++i){
            tiket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return tiket;
    }

    public static void printTicket(int ticket[]) {
        for (int i=0; i<LENGTH; ++i){
            System.out.print(ticket[i] + " | ");
        }
    }
}
