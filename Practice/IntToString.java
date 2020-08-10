package Practice;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n >= -100 && n <= 100 ){
            String s = String.valueOf(n);
            System.out.println("Good Job" + "The string is: " + n);
        }else{
            System.out.println("Wrong answer");
        }


    }
}
