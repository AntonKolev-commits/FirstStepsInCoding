package PracticeOOP;

public class Person {
    String name;
    protected String sex;
    protected String religion;
    String languageSpoken;
    String nationality;
    String job;
    protected String EGN;
    String dateOfBirth;
    int age;
    String countryOfResidence;
    Person(String name, String sex, String religion, String languageSpoken, String nationality, String job,
           String EGN, int age, String countryOfResidence) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.nationality = nationality;
        this.job = job;
        this.EGN = EGN;
        this.age = age;
        this.countryOfResidence = countryOfResidence;

    }
    Person(String name, String nationality, int age, String countryOfResidence) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.countryOfResidence = countryOfResidence;
    }


    public String getEGN() {
        return EGN;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private String getReligion() {
        return religion;
    }

    public void setDateOfBirthFromEGN(String EGN) {
        String year = EGN.substring(0, 2);
        String month = EGN.substring(2, 4);
        String day = EGN.substring(4, 6);
        setDateOfBirth(year + "/" + month + "/" + day);

    }


    public void isAdult() {
        if (countryOfResidence.equalsIgnoreCase("USA")) {
            if (age >= 21) {
                System.out.println("I'm adult! ");
            } else {
                System.out.println("I'm not adult! I need more " + (21 - age) + " years");
            }

        } else if (countryOfResidence.equalsIgnoreCase("Bulgaria")) {
            if (age >= 18) {
                System.out.println("I'm adult! ");
            } else {
                System.out.println("I'm not adult! I need more " + (18 - age) + " years");
            }
        } else if (countryOfResidence.equalsIgnoreCase("Spain")) {
            if (age >= 18) {
                System.out.println("I'm adult! ");
            } else {
                System.out.println("I'm not adult! I need more " + (18 - age) + " years");
            }
        } else if (countryOfResidence.equalsIgnoreCase("Turkey")) {
            if (age >= 18) {
                System.out.println("I'm adult! ");
            } else {
                System.out.println("I'm not adult! I need more " + (18 - age) + " years");
            }
        } else if (countryOfResidence.equalsIgnoreCase("Italy") ) {
            if (age >= 18) {
                System.out.println("I'm adult! ");
            } else {
                System.out.println("I'm not adult! I need more " + (18 - age) + " years");
            }
        } else if (countryOfResidence.equalsIgnoreCase("Germany")) {
            if (age >= 18) {
                System.out.println("I'm adult! ");
            } else {
                System.out.println("I'm not adult! I need more " + (18 - age) + " years");
            }
        }

    }
    public void celebrateEaster() {
        if (getReligion().equalsIgnoreCase("Christian")) {
            System.out.println("We celebrate Easter!");
        } else {
            System.out.println("We don't celebrate Easter!");
        }
    }
    public void sayHello() {
        if (languageSpoken.equalsIgnoreCase("Bulgarian")) {
            System.out.println("Здрасти!");
        } else if (languageSpoken.equalsIgnoreCase("Italian")) {
            System.out.println("Buongiorno!");
        } else if (languageSpoken.equalsIgnoreCase("German")) {
            System.out.println("Hallo!");
        } else if (languageSpoken.equalsIgnoreCase("Turkish")) {
            System.out.println("Merhaba!");
        } else if (languageSpoken.equalsIgnoreCase("Spanish")) {
            System.out.println("Hola!");
        }
        else {
            System.out.println("Hello!");

        }

    }
    public void canTakeLoan() {
        if (age <= 17) {
            System.out.println("You can be adult!");
        } else{
            if (job.equalsIgnoreCase("QA")) {
                System.out.println(name + " , you can take loan!");
            } else if (job.equalsIgnoreCase("Teacher")) {
                System.out.println(name + " , you can take loan!");
            } else if (job.equalsIgnoreCase("Lawyer")) {
                System.out.println(name + " , you can take loan!");
            } else if (job.equalsIgnoreCase("Doctor")) {
                System.out.println(name + " , you can take loan!");
            } else if (job.equalsIgnoreCase("Pilot")) {
                System.out.println(name + " , you can take loan!");
            }else {
                System.out.println(name + ", you can't take loan!");
                System.out.println("Please get another job!");
            }
        }

    }

}