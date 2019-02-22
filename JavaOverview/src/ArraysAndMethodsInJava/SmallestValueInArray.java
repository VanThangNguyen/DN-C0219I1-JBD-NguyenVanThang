package ArraysAndMethodsInJava;

import java.util.Scanner;

public class SmallestValueInArray {
    public static void main(String[] args) {
        int[] array;
        int size;
        int min;
        Scanner scanner = new Scanner(System.in);
        System.out.print("The number of elements in the array: ");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        min = array[0];
        for (int j = 1; j < size; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("The smallest element in the array: " + min);
    }
}
