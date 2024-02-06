
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Give numbers:");
        while (true) {
           int num = scanner.nextInt();
           if (num == -1) {
               break;
           } else if (num % 2 == 0) {
               evenCount++;
           } else {
               oddCount++;
           }
           sum += num;
           count++;
           avg = (double) sum/ count;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: "+ avg);
        System.out.println("Even "+ evenCount);
        System.out.println("Odd: "+ oddCount);
    }
}
