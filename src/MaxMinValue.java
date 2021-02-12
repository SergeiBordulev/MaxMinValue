import java.util.Scanner;

public class MaxMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number №1:");
        int number1 = scanner.nextInt();

        System.out.println("Enter number №2:");
        int number2 = scanner.nextInt();

        int max1 = (number1 > number2) ? number1 : number2;
        int min1 = (number1 < number2) ? number1 : number2;

        System.out.println("Value max: " + max1);
        System.out.println("Value min: " + min1);
        System.out.println();

        int max2;
        int min2;

        if (number2 <= number1) {
            min2 = number2;
            max2 = number1;
        } else {
            min2 = number1;
            max2 = number2;
        }

        System.out.println("Value max: " + max2);
        System.out.println("Value min: " + min2);
    }
}
