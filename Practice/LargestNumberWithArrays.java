package Practice;

import java.util.ArrayList;

public class LargestNumberWithArrays {
    public static void main(String[] args) {

        int numbers[]=new int[]  {100,232,3123,4213,542,41};
        int max = numbers[0];
        for (int n = 0; n < numbers.length ; n++) {
        if(numbers[n] > max){
            max = numbers[n];
            }
        }
        System.out.println(max);

        }

        }




