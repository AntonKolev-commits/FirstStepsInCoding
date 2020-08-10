package Practice;

import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOftourism = scanner.nextLine();
        double budget = Integer.parseInt(scanner.nextLine());

        if((typeOftourism.equalsIgnoreCase("Mountain")
        || typeOftourism.equalsIgnoreCase("Beach"))
        && budget >=50){
            System.out.println("For "+typeOftourism+ " tourism."+
                    " Your destination is outside Bulgaria");

        }else if((typeOftourism.equalsIgnoreCase("Mountain")
                || typeOftourism.equalsIgnoreCase("Beach"))
                && budget <50){
            System.out.println("For "+typeOftourism+ " tourism."+
                    " Your destination is in Bulgaria");
        }else {
            System.out.println("We don't have information about this type of tourism");
        }


        }
    }

