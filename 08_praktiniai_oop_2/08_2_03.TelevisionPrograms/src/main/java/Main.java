import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Name: ");
            String movieName = scanner.nextLine();

            if (movieName.isEmpty()) {
                break;
            }

            System.out.println("Duration: ");
            int movieDuration = Integer.parseInt(scanner.nextLine());

            TelevisionProgram movie = new TelevisionProgram(movieName, movieDuration);
            programs.add(movie);


        }

        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram result : programs ) {
            if (result.getDuration()<= maxDuration) {
                System.out.println(result );
            }

        }
    }
}
