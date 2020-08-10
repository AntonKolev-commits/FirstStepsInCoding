package Practice;

import java.util.Scanner;

public class PineThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Input value n:");
        n = input.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = n - 1; j > i; j--)
                System.out.print(" ");
            for (int j = i * 2; j >= 0; j--)
                System.out.print("*");
            System.out.println();


}}}
