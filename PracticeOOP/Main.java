package PracticeOOP;

public class Main {
    public static void main(String[] args) {
       // Person anton = new Person("Anton", "male", "Christian", "Bulgarian",
               // "Bulgarian", "Programmer",
              //  "1012312050", 18, "Bulgaria");
       // anton.setDateOfBirthFromEGN(anton.getEGN());
       // System.out.println(anton.getDateOfBirth());
       // anton.isAdult();
       // Child toni = new Child("Toni","USA", 10,"Bulgaria");
       // toni.sayHello();
       // toni.isAdult();
       // toni.canTakeLoan();
        AfricanPerson Mytj = new AfricanPerson("Unga","female","Judaism","African",
       "Africa", "Doctor","9407315320",17,"Africa" );
        Mytj.setDateOfBirthFromEGN(Mytj.getEGN());
        Mytj.sayHello();
        Mytj.isAdult();
        Mytj.celebrateEaster();
        Mytj.canTakeLoan();
        System.out.println(Mytj.getDateOfBirth());




    }
}
