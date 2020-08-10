package DataStructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class PracticeQueue {
    public static void main(String[] args) {
        Queue<String> cars = new PriorityQueue<>();
        cars.add("Honda");
        cars.add("Nissan");
        cars.add("Mazda");
        System.out.println(cars.peek());
        System.out.println(cars);


    }
}
