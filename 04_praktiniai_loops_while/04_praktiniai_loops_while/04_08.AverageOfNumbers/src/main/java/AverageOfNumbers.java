
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double avg = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            count++;
            sum += num;
            avg = sum / count;
        }
        System.out.println("Average of the numbers: " + avg);
    }
}
