package JavaProgrammingLanguage;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        for (int number = 2; number < 100; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(" " + number);
            }
        }
    }
}
