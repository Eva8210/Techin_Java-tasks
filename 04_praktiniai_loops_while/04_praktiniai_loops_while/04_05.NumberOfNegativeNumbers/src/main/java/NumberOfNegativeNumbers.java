
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("Give a number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                count++;
            }
        }
        System.out.println("Number of negative numbers: " + count);
    }
}
