package ca.ucalgary.ensf380;

public class Nonfiction extends Paperback {
    public Nonfiction(String ISBN, int numPages) {
        super(ISBN, numPages);
    }

    public String topic() {
        return "Method topic called from Nonfiction";
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Paperback";
    }
}
