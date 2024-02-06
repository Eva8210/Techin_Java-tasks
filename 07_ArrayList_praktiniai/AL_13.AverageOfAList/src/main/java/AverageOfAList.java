
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int sum= 0;
        double avg = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextInt());
            if (input ==-1) {
                break;
            }
            list.add(input);
            sum += input;
            avg = (double)  sum / list.size();
        }
        System.out.println("Average" + avg);
        
    }
}
