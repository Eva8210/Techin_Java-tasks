
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
            numbers.add(luku);

        }
//        too advanced
//        System.out.println(numbers.toString() .replace("[",  "") .replace("]", ""));
//        1 variantas
        for (Integer nr: numbers) {
            System.out.println(nr);
        }
//        2 variantas (advanced)
//        numbers.forEach(System.out::println);
    }
}
