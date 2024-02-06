
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num > 0) {
                double result = Math.pow(num, 2);
                System.out.println(result);
            }
            else {
                    System.out.println("Unsuitable number");
                }


        }
    }
}
