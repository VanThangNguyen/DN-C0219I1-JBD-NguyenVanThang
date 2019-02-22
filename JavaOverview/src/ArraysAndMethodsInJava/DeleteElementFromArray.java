package ArraysAndMethodsInJava;

import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int numberDeleted;
        int index_del = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to delete: ");
        numberDeleted = scanner.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberDeleted) {
                index_del = i;
            }
        }
        if (index_del != -1) {
            for (int j = index_del; j < numbers.length-1; j++) {
                numbers[j] = numbers[j+1];
            }
            System.out.println("Array after deleting element:");
            for (int k = 0; k < numbers.length; k++) {
                System.out.print(" " + numbers[k]);
            }
        } else {
            System.out.println("No element found in array");
        }
    }
}
