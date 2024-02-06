import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println( "Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()){
                break;
            }

            System.out.println("Pages: ");
            int bookPages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            int bookYear = Integer.parseInt(scanner.nextLine());

            Book inputedBook = new Book(bookTitle, bookPages, bookYear);
            bookList.add(inputedBook);
        }
        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();

        for (Book result: bookList) {
            if (answer.equals("everything")) {
                System.out.println(result);
            } else if (answer.equals("name")) {
                System.out.println(result.getTitle());
            }
        }
    }
}
