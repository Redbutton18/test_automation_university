package chapter9;

public class Fruit {

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    private int calories;

    public void makeJuice() {
        System.out.println("Juice is made!");
    }
}
