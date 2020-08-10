package Practice;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double Area = b*h/2;

        System.out.println(Area);
    }
}
