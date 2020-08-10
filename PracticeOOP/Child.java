package PracticeOOP;

public class Child extends Person {

    Child(String name, String nationality, int age, String countryOfResidence) {
        super(name, nationality, age, countryOfResidence);
    }
    public void sayHello() {
        if (age > 2 && nationality.equalsIgnoreCase("Bulgarian")) {
            System.out.println("Здравейй!");
        } else if (age > 2 && nationality.equalsIgnoreCase("USA")) {
            System.out.println("Hi!");
        } else if (age < 2) {
            System.out.println("MmMmmM");
        }
    }
    public void isAdult() {
        if (age >= 5 && nationality.equalsIgnoreCase("Bulgarian")) {
            System.out.println("I'm SUPERMEN! And I want to be BATMAN but I need more " + (18 - age) + " years!");
        } else if (age >= 5 && nationality.equalsIgnoreCase("USA")) {
            System.out.println("I'm SPONGEBOB! And I want to be SQUIDWARD but I need more " + (18 - age) + " years!");
        }
    }
    public void canTakeLoan() {
        System.out.println("I don't want to be prisoner! :)");
    }

}