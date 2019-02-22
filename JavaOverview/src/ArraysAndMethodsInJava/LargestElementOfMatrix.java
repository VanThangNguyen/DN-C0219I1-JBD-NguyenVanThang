package ArraysAndMethodsInJava;

import java.util.Scanner;

public class LargestElementOfMatrix {
    public static void main(String[] args) {
        int rows;
        int columns;
        int[][] matrix;
        int max;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows of matrix: ");
        rows = scanner.nextInt();
        System.out.print("Enter columns of matrix: ");
        columns = scanner.nextInt();
        matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print("Element row " + (row+1) + ", column " + (column+1) + ": ");
                matrix[row][column] = scanner.nextInt();
            }
        }
        max = matrix[0][0];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                }
            }
        }
        System.out.println("The largest element of the matrix: " + max);
    }
}
