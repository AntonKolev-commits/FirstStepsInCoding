package Methods;

public class MethodsOverloading {
    static int methodInt (int x,int y){
        return x + y;
    }static double methodDouble(double x,double y){
        return x + y;
    }

    public static void main(String[] args) {
        int myIntNums = methodInt(2,4);
        double myDoubleNums = methodDouble(2.5, 1.5);
        System.out.println(myIntNums);
        System.out.println(myDoubleNums);
    }
}
