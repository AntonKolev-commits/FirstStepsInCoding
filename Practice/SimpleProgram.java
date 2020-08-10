package Practice;

import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        int day = Integer.parseInt(days.nextLine());
        String preffix = "";
        if (day == 1) {
            preffix = "st";
        } else if (day == 2) {
            preffix = "nd";
        } else if (day == 3) {
            preffix = "rd";
        } else if (day >= 4) {
            preffix = "th";
        }

        switch (day) {
            case 1:
                System.out.println("It's 1'" + preffix + " day of the week" + ":Monday");
                break;
            case 2:
                System.out.println("It's 2'" + preffix + " day of the week" + ":Tuesday");
                break;
            case 3:
                System.out.println("It's 3'" + preffix + " day of the week" + ":Wednesday");
                break;
            case 4:
                System.out.println("It's 4'" + preffix + " day of the week" + ":Thursday");
                break;
            case 5:
                System.out.println("It's 5'" + preffix + " day of the week" + ":Friday");
                break;
            case 6:
                System.out.println("It's 6'" + preffix + " day of the week" + ":Saturday");
                break;
            case 7:
                System.out.println("It's 7'" + preffix + " day of the week" + ":Sunday");
                break;
            default:
                System.out.println("You are in another planet");
        }


    }
}

