package DataStructures;

import java.util.Iterator;
import java.util.Stack;

public class PracticeStack {
    public static void main(String[] args) {
        Stack<String> cars = new Stack<>();
        cars.push("Honda");
        cars.push("Mazda");
        cars.push("Nissan");
        Iterator<String> carsIterator = cars.iterator();
        while(carsIterator.hasNext()){
            String cars1 = carsIterator.next();
            System.out.println(cars1);
        }

    }
}
