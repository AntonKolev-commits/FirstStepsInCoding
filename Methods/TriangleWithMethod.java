package Methods;

import java.util.Scanner;

public class TriangleWithMethod {
     public void triangleMethod(){
         Scanner scanner = new Scanner(System.in);
         double basis = Double.parseDouble(scanner.nextLine());
         double thighs1 = Double.parseDouble(scanner.nextLine());
         double thighs2 = Double.parseDouble(scanner.nextLine());
         double basisDegree = Double.parseDouble(scanner.nextLine());
         double thighsDegree1 = Double.parseDouble(scanner.nextLine());
         double thighsDegree2 = Double.parseDouble(scanner.nextLine());
         double alldegrees = basisDegree+thighsDegree1+thighsDegree2;


         if (alldegrees==180 ){
             System.out.println("We have Triangle!And the Triangle is: ");
             if((basis==thighs1 && thighs1==thighs2)
                     && (basisDegree==thighsDegree1
                     && thighsDegree1==thighsDegree2)){
                 System.out.println("Equilateral");

             }else if(thighs1==thighs2 && thighsDegree1==thighsDegree2){
                 System.out.println("Isosceles");

             }else if((basis != thighs1 && thighs1 != thighs2)
                     && (basisDegree != thighsDegree1
                     && thighsDegree1 != thighsDegree2)){
                 System.out.println("Multifaceted");

             }else if(basisDegree == 90 || thighsDegree1 == 90
                     || thighsDegree2 == 90){
                 System.out.println("Right-angled");

             }else if(basisDegree >=91 || thighsDegree1 >= 91
                     || thighsDegree2 >= 91){
                 System.out.println("Obtuse");

             }

         }else {
             System.out.println("We have Triangle and it is: Triangle-acute");
         }


     }
     public void calculateP(){
         System.out.println("asd");
     }
     }






