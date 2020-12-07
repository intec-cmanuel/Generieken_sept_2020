package be.intecbrussel.demo2;

public class MixedDuo<E, T> {
    private E first;
    private T second;

    public MixedDuo(E first, T second) {
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

    public void swap() {
        // Zal niet gaan, T object kan niet in E variable geplaatst worden.
    }
}
