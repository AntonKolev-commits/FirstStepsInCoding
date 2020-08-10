package PracticeOOP;

public class AfricanPerson extends Person {

    AfricanPerson(String name, String sex, String religion, String languageSpoken,
                  String nationality, String job, String EGN, int age, String countryOfResidence) {
        super(name, sex, religion, languageSpoken, nationality, job, EGN, age, countryOfResidence);
    }
    public void sayHello() {
        if (languageSpoken.equalsIgnoreCase("African")) {
            System.out.println("Goeie dag!");
        } else {
            System.out.println("Hello!");
        }
    }
    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("Judaism")) {
            System.out.println("We don't celebrate Eastern!");
        }
    }
}