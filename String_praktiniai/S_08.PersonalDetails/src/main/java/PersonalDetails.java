
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLength = 0;
        String longest = "";
        int count = 0;
        int sum =0;
        double avg =0;

        while (true) {
            String input = scanner.nextLine();
            //"aaa,10"

            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            //["aaa", "10"]
            int year = Integer.parseInt(pieces[1]);
            //10
            String name = pieces[0];
            //"aaa"
            if (name.length() > maxLength) {
                maxLength = name.length();
                longest = name;
            }
            count++;
            sum += year;
            avg = (double) sum / count;
        }

        System.out.println("Longest name: " + longest );
        System.out.println("Average of the birth years: " + avg);
    }
}
