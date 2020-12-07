package be.intecbrussel.demo1;

import java.util.Scanner;

public class DuoApp {
    public static void main(String[] args) {
        Duo<Apple> appleDuo = new Duo<>(new Apple(), new Apple());
        Duo<Pear> pearDuo = new Duo<>(new Pear(), new Pear());
        Duo<Dog> dogDuo = new Duo<>(new Dog("Sofia"), new Dog("Ronaldo"));

        Pear pear = pearDuo.getFirst();
        pear.eat();

        System.out.println("Fruit is gezond!");
        System.out.println("Water is ook gezond!");
        System.out.println("\n\n\n");

        System.out.println(dogDuo);
        dogDuo.swap();
        System.out.println(dogDuo);

        System.out.println("Do you want a pear, or a very overpriced computer?");
        String input = new Scanner(System.in).nextLine();

        Duo<?> foodDuo = null;
        if (input.equalsIgnoreCase("apple")){
            foodDuo = new Duo<>(new Apple(), new Apple());
        } else if (input.equalsIgnoreCase("pear")){
            foodDuo = new Duo<>(new Pear(), new Pear());
        }

        System.out.println("eating: " + foodDuo.getFirst() + " " + foodDuo.getSecond());
        System.out.println("-".repeat(11));

        Integer[] intArr;
        intArr = new Integer[5];

        Duo<?>[] intDuoArr = new Duo<?>[5];
    }
}
