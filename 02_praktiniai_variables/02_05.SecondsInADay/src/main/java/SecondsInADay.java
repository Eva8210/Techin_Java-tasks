
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.parseInt(scanner.nextLine());
        int hours = 24;
        int mul;

        mul = days * hours;

        System.out.println(mul * 3600);


    }
}
