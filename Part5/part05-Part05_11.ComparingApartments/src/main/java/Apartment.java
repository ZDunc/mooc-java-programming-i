
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares)
            return true;
        else
            return false;
    }

    public int priceDifference(Apartment compared) {
        int diff = (this.pricePerSquare*this.squares) - (compared.pricePerSquare*compared.squares);
        if (diff < 0)
            diff *= -1;

        return diff;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int diff = (this.pricePerSquare*this.squares) - (compared.pricePerSquare*compared.squares);
        if (diff > 0)
            return true;
        else
            return false;
    }

}
