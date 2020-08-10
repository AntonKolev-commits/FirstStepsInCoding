package Practice;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();
        String name = scanner.nextLine();
        if(age >= 16 && gender.equalsIgnoreCase("Male")){
            System.out.println("Mr." + name + ".You can work!");
        }else if(age <= 15 && gender.equalsIgnoreCase("Male")){
            System.out.println("Mr." + name + ".You can't work!");
        }if(age >= 18 && gender.equals("Female")){
            System.out.println("Ms." + name + ".You can work!");
        }else if(age <= 17 && gender.equalsIgnoreCase("Female")){
            System.out.println("Ms." + name + ".You can't work!");
        }if (age >= 65){
            System.out.println("Go have fun!!!");
        }

    }
}
