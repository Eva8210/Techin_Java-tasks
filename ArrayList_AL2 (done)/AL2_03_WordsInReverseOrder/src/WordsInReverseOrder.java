import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                break;
            }
            list.add(word);
        }
        Collections.reverse(list);

        for (String text: list) {

            System.out.println(text);
        }
    }
}
