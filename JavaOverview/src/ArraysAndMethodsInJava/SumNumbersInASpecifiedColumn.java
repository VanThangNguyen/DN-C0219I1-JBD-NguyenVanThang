package ArraysAndMethodsInJava;

import java.util.Scanner;

public class SumNumbersInASpecifiedColumn {
    public static void main(String[] args) {
        int rows;
        int columns;
        int col;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows of matrix: ");
        rows = scanner.nextInt();
        System.out.print("Enter columns of matrix: ");
        columns = scanner.nextInt();
        int[][] matrix;
        matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print("Element row " + row + ", column " + column + ": ");
                matrix[row][column] = scanner.nextInt();
            }
        }
        System.out.print("The sum of the column: ");
        col = scanner.nextInt();
        for (int row = 0; row < rows; row++) {
            sum += matrix[row][col];
        }
        System.out.println("Sum numbers of column "+ col +": " + sum);
    }
}
