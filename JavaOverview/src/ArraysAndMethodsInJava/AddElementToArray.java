package ArraysAndMethodsInJava;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int numberToInsert;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mảng ban đầu:");
        for (int l = 0; l < numbers.length; l++) {
            System.out.print(" " + numbers[l]);
        }
        System.out.print("\nNhập số cần chèn: ");
        numberToInsert = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn trong mảng: ");
        index = scanner.nextInt();
        if (index <= 1 && index >= numbers.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = index; i < numbers.length; i++) {
                if (numbers[i] == 0) {
                    for (int j = i; j > index; j--) {
                        numbers[j] = numbers[j-1];
                    }
                    break;
                }
            }
            numbers[index] = numberToInsert;
            System.out.println("Mảng sau khi chèn:");
            for (int k = 0; k < numbers.length; k++) {
                System.out.print(" " + numbers[k]);
            }
        }
    }
}
