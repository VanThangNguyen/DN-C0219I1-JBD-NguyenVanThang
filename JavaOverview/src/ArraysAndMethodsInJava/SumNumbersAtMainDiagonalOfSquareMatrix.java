package ArraysAndMethodsInJava;

import java.util.Scanner;

public class SumNumbersAtMainDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        int[][] squareMatrix;
        int size;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the matrix size: ");
        size = scanner.nextInt();
        squareMatrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element row " + i + ", column " + j + ": ");
                squareMatrix[i][j] = scanner.nextInt();
            }
        }
        for (int k = 0; k < size; k++) {
            sum += squareMatrix[k][k];
        }
        System.out.println("Sum the numbers in the main diagonal of the square matrix: " + sum);
    }
}
