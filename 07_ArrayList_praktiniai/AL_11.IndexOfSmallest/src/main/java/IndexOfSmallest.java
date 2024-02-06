
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        int num = Collections.min(list);
        System.out.println("Smallest number: " + Collections.min(list));

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) == num) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
