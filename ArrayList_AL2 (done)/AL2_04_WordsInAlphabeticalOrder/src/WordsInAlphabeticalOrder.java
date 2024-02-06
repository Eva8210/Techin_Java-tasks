
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                break;
            }
            list.add(word);

        }
        Collections.sort(list);
        System.out.println("You typed the following words: ");
        for (String result : list) {
            System.out.println(result);

        }
    }
}
