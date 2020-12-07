package be.intecbrussel.demo3;

public class Demo3App {
    public static void main(String[] args) {
        NDuo<Integer, Short> numberDuo = new NDuo<>(3, Short.valueOf("5"));
        NDuo<Double, Float> commaDuo = new NDuo<>(52.4, 489F);
        double sum = numberDuo.sum();
        System.out.println(sum);

//        Number n1 = new Integer(5);
//        Number n2 = new Long(6);
//        Number n3 = n1 + n2;
    }
}
