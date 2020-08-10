package Practice;

import java.util.Scanner;

public class JavaName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String FirstName = scanner.nextLine();
        String MiddleName = scanner.nextLine();
        String LastName = scanner.nextLine();


        System.out.println((FirstName + " " + MiddleName + " " + LastName).toUpperCase());
       System.out.println(FirstName.concat(LastName)+"@gmail.com");


    }
}
