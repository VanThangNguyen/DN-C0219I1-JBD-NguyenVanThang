package JavaProgrammingLanguage;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("USD: ");
        usd = scanner.nextDouble();
        double vnd = usd * rate;
        System.out.println("VND: " + vnd);
    }
}
