public class TestDate {

    public static void main(String[] args) {
        Date a1 = new Date(7, 11, 2500);
        System.out.println(a1.toString());
        System.out.printf("%02d/%02d/%04d",a1.getDay(),  a1.getMonth(), a1.getYear());
    }
}
