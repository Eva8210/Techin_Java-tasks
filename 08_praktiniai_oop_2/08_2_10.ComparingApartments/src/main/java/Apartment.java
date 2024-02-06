
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }else {
            return false;
        }
    }
    public  int priceDifference (Apartment compared) {
        int difference = 0;
        if(this.totalPrice()> compared.totalPrice()) {
            difference = this.totalPrice() - compared.totalPrice();
        } else {
            difference = compared.totalPrice() - this.totalPrice();
        }
        return difference;
    }
    public int totalPrice(){
        return squares*princePerSquare;
    }
    public boolean moreExpensiveThan (Apartment compared) {
        if (this.totalPrice() > compared.totalPrice()) {
            return true;
        } else {
            return false;
            }
    }
}
