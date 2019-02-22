package ArraysAndMethodsInJava;

import java.util.Scanner;

public class NumberOfOccurrencesOfCharactersInString {
    public static void main(String[] args) {
        String string;
        char character;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = scanner.next();
        System.out.print("Enter a character: ");
        character = scanner.next().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Number of occurrences of character \""+ character +"\" in the string \""+ string +"\": " + count);
    }
}
