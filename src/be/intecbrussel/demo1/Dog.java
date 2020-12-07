package be.intecbrussel.demo1;

public class Dog extends Fruit{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My doggy is named: " + name + "\n";
    }
}
