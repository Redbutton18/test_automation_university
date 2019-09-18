package chapter9;

public class Banana extends Fruit {

    public Banana() {
        setCalories(120);
    }

    public void peel() {
        System.out.println("remove peel");
    }

    @Override
    public void makeJuice() {
        super.makeJuice();
        System.out.println("Your banana juice is ready!");
    }
}
