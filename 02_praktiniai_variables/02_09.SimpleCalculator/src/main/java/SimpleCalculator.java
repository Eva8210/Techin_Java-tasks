
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int number2 = Integer.parseInt(scanner.nextLine());

        int sum = number1 + number2;
        int minus = number1 - number2;
        int mul = number1 * number2;
        double div = (double) number1/ (double) number2;

        System.out.println( number1 + " + " +number2 +" = "+sum);
        System.out.println( number1 + " - " +number2 +" = "+minus);
        System.out.println( number1 + " * " +number2 +" = "+mul);
        System.out.println( number1 + " / " +number2 +" = "+div);
    }
}
