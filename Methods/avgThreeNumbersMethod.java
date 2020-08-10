package Methods;

import java.util.Scanner;

public class avgThreeNumbersMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number!");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter second number!");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter third number");
        double num3 = Double.parseDouble(scanner.nextLine());
        double sum = num1 + num2 + num3;
        System.out.println("The sum of the numbers are: " + sum);

        System.out.println("The avg of the numbers is: " + avgNums(num1,num2,num3));


    }public static double avgNums(double a,double b, double c){
        double ansAvg = (a + b + c) / 3;
        return ansAvg;
    }
}




