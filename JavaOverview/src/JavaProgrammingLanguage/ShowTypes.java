package JavaProgrammingLanguage;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        do {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);
            switch (choice) {
                case '1':
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case '2':
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case '3':
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5 - i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int m = 0; m < i * 2 + 1; m++) {
                            System.out.print("*");
                        }
                        for (int k = 5 - i; k > 1; k--) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
            }
        } while (choice != '4');
    }
}
