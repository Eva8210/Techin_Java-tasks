
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =0;
        double sum =0;
        double avg =0;

        while (true) {
            System.out.println();
            int num = scanner.nextInt();
            if (num ==0) {
                break;
            } else if (num > 0) {
                count++;
                sum += num;
                avg = sum / count;
            }
        }
        if (count > 0) {
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
