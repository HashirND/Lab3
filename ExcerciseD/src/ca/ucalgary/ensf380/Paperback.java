package ca.ucalgary.ensf380;

public abstract class Paperback extends Book {
    public Paperback(String ISBN, int numPages) {
        super(ISBN, numPages);
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Paperback";
    }
}
