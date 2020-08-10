package DataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> cars  = new ArrayList<String>();
        cars.add("Honda");
        cars.add("Mazda");
        cars.add("Nissan");
        System.out.println(cars);
        System.out.println(cars.get(0));
        cars.set(2, "Nissan Skyline");
        System.out.println(cars.get(2));
        System.out.println(cars.size());
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println(i);

        }
    }
}
