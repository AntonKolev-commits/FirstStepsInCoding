package DataStructures;

import java.util.Scanner;

public class  BiggestElementOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Matrix Rows: ");
        int numberRows = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of Matrix Columns: ");
        int numberColumns = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[numberRows][numberColumns];
        int max = matrix[0][0];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < numberRows ; i++) {
            for (int j = 0; j < numberColumns; j++) {
                matrix[i][j] = scanner.nextInt();

            }
        }System.out.println("MatrixArray is: ");
        for (int i = 0; i < numberRows ; i++) {
            for (int j = 0; j < numberColumns; j++) {
                System.out.print(matrix[i][j] + " ");
                if (max < matrix[i][j]){
                    max = matrix[i][j];


                }
            }System.out.println(" ");

        }
        System.out.println("The biggest number in Array is: " + max);

        }


    }

