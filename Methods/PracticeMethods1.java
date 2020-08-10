package Methods;

public class PracticeMethods1 {
    static void CheckP(double a, double b, double c){
        double P = a + b + c;
        if(a<0 || b<0 || c<0){
            System.out.println("Can't be negative number");
        }else{
            System.out.println("Per. is: " + P);
        }

    }

    public static void main(String[] args) {
        CheckP(2.1,-23,2);
    }
}
