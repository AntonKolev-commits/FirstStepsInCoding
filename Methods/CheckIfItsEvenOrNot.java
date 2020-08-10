package Methods;

import java.util.Scanner;

public class CheckIfItsEvenOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number!");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("Is the number even: " + isEvenOrNot(num)  +"\nThe number is: "+ num);

    }public static boolean isEvenOrNot(int a){
        if(a % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
