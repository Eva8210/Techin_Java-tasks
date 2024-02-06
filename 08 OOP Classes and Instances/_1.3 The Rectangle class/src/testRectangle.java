public class testRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        System.out.println("The rectangle has area of " +r1.getArea() + " and perimeter of "+r1.getPerimeter());

        Rectangle r2 = new Rectangle(2f,4f);
        System.out.println("The rectangle has area of " +r2.getArea() + " and perimeter of "+r2.getPerimeter());
    }
}
