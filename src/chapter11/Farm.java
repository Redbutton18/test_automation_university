package chapter11;

public class Farm {
    public static void main(String[] args) {
        Animal donald = new Duck();
        donald.makeSound();

        Duck duffy = new Duck();
        duffy.makeSound();

        Pig porky = new Pig();
        porky.makeSound();
    }
}
