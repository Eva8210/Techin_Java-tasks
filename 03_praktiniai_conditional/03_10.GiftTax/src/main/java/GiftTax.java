
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int price = Integer.parseInt(scan.nextLine());

        if ( price < 5000) {
            System.out.println("No tax!");
        }
        else if (price <= 25000) {
            double sum = (100 + (price - 5000) * 0.08);
            System.out.println("Tax: " + sum);
        }
        else if (price <= 55000) {
            double sum = (1700 + (price - 25000) * 0.1);
            System.out.println("Tax: " + sum);
        }
        else if (price <= 200000) {
            double sum = (4700 + (price - 55000) * 0.12);
            System.out.println("Tax: " + sum);
        }
        else if (price <= 1000000) {
            double sum = (22100 + (price - 200000) * 0.15);
            System.out.println("Tax: " + sum);
        }
        else if (price > 1000001) {
            double sum = (142100 + (price - 1000000) * 0.17);
            System.out.println("Tax: " + sum);
        }
    }
}
