package ArraysAndMethodsInJava;

import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        int array1Length;
        int array2Length;
        int[] array1;
        int[] array2;
        int[] array3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array1 length: ");
        array1Length = scanner.nextInt();
        array1 = new int[array1Length];
        createElementArray(array1);
        System.out.print("Array2 length: ");
        array2Length = scanner.nextInt();
        array2 = new int[array2Length];
        createElementArray(array2);
        array3 = combineArray(array1, array2);
        System.out.print("Array3: ");
        for (int k = 0; k < array3.length; k++) {
            System.out.print(" " + array3[k]);
        }
        System.out.println("\nArray3 length: " + array3.length);
    }

    public static void createElementArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
    }

    public static int[] combineArray(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = array1.length; j < array2.length + array1.length; j++) {
            array3[j] = array2[j - array1.length];
        }
        return array3;
    }
}
