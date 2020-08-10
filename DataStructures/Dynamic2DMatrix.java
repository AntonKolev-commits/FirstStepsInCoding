package DataStructures;

import java.util.Scanner;

public class Dynamic2DMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Matrix Rows: ");
        int matrixRows = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the number of Matrix Columns: ");
        int matrixColumns = Integer.parseInt(scanner.nextLine());
        int [][] nums = new int[matrixRows][matrixColumns];
        System.out.println("Enter nums: ");
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumns; j++) {
                nums[i][j] = scanner.nextInt();

            }

        }
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumns; j++) {
                System.out.print(nums[i][j]+ " ");

            }
            System.out.println(" ");
        }
    }
}
