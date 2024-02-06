
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        String name = "";

        while(true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            String[] piece = input.split(",");
            int age = Integer.parseInt(piece[1]);


            if (age > max) {
                max = age;
                name = piece[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
