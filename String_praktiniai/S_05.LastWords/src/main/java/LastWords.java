
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] piece = input.split(" ");
            int last = piece.length -1;
            System.out.println(piece[last]);
        }
    }
}
