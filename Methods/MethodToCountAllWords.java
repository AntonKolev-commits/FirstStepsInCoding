package Methods;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class MethodToCountAllWords {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num1 = parseInt(scanner.nextLine());
      int num2 = parseInt(scanner.nextLine());


      int ans = multiplyNums(num1,num2);
      System.out.println("When we multiply num1 and num2: " + ans);
      double ans2 = devisionNums(num1,num2);
      System.out.println("When we devisionNums: "+ ans2);
      boolean ans3 = equalsNums(num1,num2);
      System.out.println("Are the nums equals: " + ans3);

   }
   public static int multiplyNums(int a, int b ){
      int answer = a + b;
      return answer;
   }
   public static double devisionNums(double a,double b){
      double answer = a/b;
      return answer;
   }
   public static boolean equalsNums(double a, double b){
      if (a == b){
         return true;
      }else{
         return false;
      }
   }
}
