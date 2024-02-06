
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = "alex";
        String name2 = "emma";
        String pass1 = "sunshine";
        String pass2 = "haskell";

        System.out.println("Enter surname: ");
        String inputName = scanner.nextLine();
        System.out.println("Enter surname: ");
        String inputPass = scanner.nextLine();

        if (inputName.equals(name1) && inputPass.equals(pass1)) {
            System.out.println("You have successfully logged in!");
        }
        else if (inputName.equals(name2) && inputPass.equals(pass2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
