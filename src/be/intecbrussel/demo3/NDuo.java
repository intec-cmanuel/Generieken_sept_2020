package be.intecbrussel.demo3;

public class NDuo<E extends Number, T extends Number> implements Comparable<E>{
    private E first;
    private T second;

    public NDuo(E first, T second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public double sum() {
        return first.doubleValue() + second.doubleValue();
    }

    @Override
    public int compareTo(E o) {
        return 0;
    }
}
