package DataStructures;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Honda");
        cars.addFirst("Honda Civic");
        cars.addLast("Honda Prelude");
        cars.add(2,"Honda CRV");
        System.out.println(cars);
        cars.removeLast ();
        boolean exist = cars.contains("BMV");
        System.out.println(cars);
        System.out.println(exist);

    }
}
