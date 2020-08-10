package Practice;

import java.util.Scanner;

public class CalculateTheRevue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pricePerUnit = Integer.parseInt(scanner.nextLine());
        int quantity = Integer.parseInt(scanner.nextLine());
        double discount;
        double revanueForSale = pricePerUnit * quantity;
        if (quantity < 100 || quantity > 120) {
            if (quantity > 120){
                discount = (pricePerUnit * quantity) * 0.20;
                System.out.println("The revenue from sale: " + (revanueForSale - discount)+"$");
                System.out.println("Discount is: " + discount+"$");
            }else{
                System.out.println("The revenue from sale: " +revanueForSale+"$");
                System.out.println("No discount");
            }
        } else {
            discount = (pricePerUnit * quantity) * 0.15;
            System.out.println("The revenue from sale: " + (revanueForSale - discount)+"$");
            System.out.println("Discount is: " + discount+"$");
        }
    }
}
