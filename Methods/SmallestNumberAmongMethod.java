package Methods;

public class SmallestNumberAmongMethod {
    public static void main(String[] args) {


        double[] num = {2, 3, 5};
        System.out.println(findMinNumber(num));

    }
    public static double findMinNumber(double[] arrayOfNumbers){
        double minNumber = arrayOfNumbers[0];
        for (int i = 1; i < arrayOfNumbers.length ; i++) {
            if (arrayOfNumbers[i] < minNumber){
                minNumber = arrayOfNumbers[i];
            }

        }
             return minNumber;
    }
}




