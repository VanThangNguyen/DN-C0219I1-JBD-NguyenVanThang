package JavaProgrammingLanguage;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = scanner.nextInt();
        if (number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number < 100) {
            switch (String.valueOf(number).charAt(0)) {
                case '2':
                    System.out.print("twenty");
                    break;
                case '3':
                    System.out.print("thirty");
                    break;
                case '4':
                    System.out.print("forty");
                    break;
                case '5':
                    System.out.print("fifty");
                    break;
                case '6':
                    System.out.print("sixty");
                    break;
                case '7':
                    System.out.print("seventy");
                    break;
                case '8':
                    System.out.print("eighty");
                    break;
                case '9':
                    System.out.print("ninety");
                    break;
            }
            switch (String.valueOf(number).charAt(1)) {
                case '0':
                    break;
                case '1':
                    System.out.println(" one");
                    break;
                case '2':
                    System.out.println(" two");
                    break;
                case '3':
                    System.out.println(" three");
                    break;
                case '4':
                    System.out.println(" four");
                    break;
                case '5':
                    System.out.println(" five");
                    break;
                case '6':
                    System.out.println(" six");
                    break;
                case '7':
                    System.out.println(" seven");
                    break;
                case '8':
                    System.out.println(" eight");
                    break;
                case '9':
                    System.out.println(" nine");
                    break;
            }
        } else {
            switch (String.valueOf(number).charAt(0)) {
                case '1':
                    System.out.print("one hundred");
                    break;
                case '2':
                    System.out.print("two hundred");
                    break;
                case '3':
                    System.out.print("three hundred");
                    break;
                case '4':
                    System.out.print("four hundred");
                    break;
                case '5':
                    System.out.print("five hundred");
                    break;
                case '6':
                    System.out.print("six hundred");
                    break;
                case '7':
                    System.out.print("seven hundred");
                    break;
                case '8':
                    System.out.print("eight hundred");
                    break;
                case '9':
                    System.out.print("nine hundred");
                    break;
            }
            switch (String.valueOf(number).charAt(1)) {
                case '0':
                    switch (String.valueOf(number).charAt(2)) {
                        case '0':
                            break;
                        case '1':
                            System.out.println(" and one");
                            break;
                        case '2':
                            System.out.println(" and two");
                            break;
                        case '3':
                            System.out.println(" and three");
                            break;
                        case '4':
                            System.out.println(" and four");
                            break;
                        case '5':
                            System.out.println(" and five");
                            break;
                        case '6':
                            System.out.println(" and six");
                            break;
                        case '7':
                            System.out.println(" and seven");
                            break;
                        case '8':
                            System.out.println(" and eight");
                            break;
                        case '9':
                            System.out.println(" and nine");
                            break;
                    }
                    break;
                case '1':
                    switch (String.valueOf(number).charAt(2)) {
                        case '0':
                            System.out.println(" and ten");
                            break;
                        case '1':
                            System.out.println(" and eleven");
                            break;
                        case '2':
                            System.out.println(" and twelve");
                            break;
                        case '3':
                            System.out.println(" and thirteen");
                            break;
                        case '4':
                            System.out.println(" and fourteen");
                            break;
                        case '5':
                            System.out.println(" and fifteen");
                            break;
                        case '6':
                            System.out.println(" and sixteen");
                            break;
                        case '7':
                            System.out.println(" and seventeen");
                            break;
                        case '8':
                            System.out.println(" and eighteen");
                            break;
                        case '9':
                            System.out.println(" and nineteen");
                            break;
                    }
                    break;
                default:
                    switch (String.valueOf(number).charAt(1)) {
                        case '2':
                            System.out.print(" and twenty");
                            break;
                        case '3':
                            System.out.print(" and thirty");
                            break;
                        case '4':
                            System.out.print(" and forty");
                            break;
                        case '5':
                            System.out.print(" and fifty");
                            break;
                        case '6':
                            System.out.print(" and sixty");
                            break;
                        case '7':
                            System.out.print(" and seventy");
                            break;
                        case '8':
                            System.out.print(" and eighty");
                            break;
                        case '9':
                            System.out.print(" and ninety");
                            break;
                    }
                    switch (String.valueOf(number).charAt(2)) {
                        case '0':
                            break;
                        case '1':
                            System.out.println(" one");
                            break;
                        case '2':
                            System.out.println(" two");
                            break;
                        case '3':
                            System.out.println(" three");
                            break;
                        case '4':
                            System.out.println(" four");
                            break;
                        case '5':
                            System.out.println(" five");
                            break;
                        case '6':
                            System.out.println(" six");
                            break;
                        case '7':
                            System.out.println(" seven");
                            break;
                        case '8':
                            System.out.println(" eight");
                            break;
                        case '9':
                            System.out.println(" nine");
                            break;
                    }
            }
        }
    }
}
