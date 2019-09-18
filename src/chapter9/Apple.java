package chapter9;

public class Apple extends Fruit {

    public Apple() {
        setCalories(85);
    }

    public void removeSeeds() {
        System.out.println("remove seeds");
    }

    @Override
    public void makeJuice() {
        super.makeJuice();
        System.out.println("Your apple juice is ready!");
    }
}
