package chapter4;

public class RollTheDieGame {
    public static void main(String[] args) {
//        int min = 1;
//        int max = 6;
//        int rnd = rnd(min, max);
        int spaces = 20;
        int steps = 5;

        //Realization of the Game
        int sum = 0;
        for(int i = 0; i<steps; ++i){
            int dieValue = rnd(1, 6);
            System.out.println("Your step is " + (i+1));
            sum = sum + dieValue;
            System.out.println("Your score is " + sum);
            System.out.println("You have " + (steps-(i+1)) +" steps");
            }
        if(sum==spaces && steps<=5){
            System.out.println("You win!!!");
        }
        else {
            System.out.println("You lose! Your score is " + sum + " spaces");
        }
    }
    public static int rnd(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
