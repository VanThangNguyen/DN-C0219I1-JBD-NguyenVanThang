package JavaProgrammingLanguage;

import java.util.Scanner;

public class TheFirst20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of primes: ");
        int numbers = Integer.parseInt(scanner.next());
        int count = 1;
        int number = 3;
        String result = "2";
        while (count != numbers) {
            boolean isPrime = true;
            for (int i = 3; i <= Math.sqrt(number); i+=2) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                result += " " + number;
                count++;
            }
            number += 2;
        }
        System.out.println(result);
    }
}
