
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int numTo = scanner.nextInt();
        System.out.println("Where from? ");
        int numFrom = scanner.nextInt();

        for (int i = numFrom; i <= numTo; i++) {
            System.out.println(i);
        }
    }
}
