package Practice;



public class LargeNumberWithArray {
    public static void main(String[] args) {
        int numbers[]=new int[]  {100,232,3123,4213,542,41};
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max){
                max = number;
            }

        }
        System.out.println(max);
    }



    }





