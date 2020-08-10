package Practice;

import java.util.Scanner;

public class PerimeterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int P = a + b + c;

        if(a<=0 && b<=0 && c<=0){

            System.out.println("Can't be Negative number");}
        else {
            System.out.println(P);

        }
    }
}
