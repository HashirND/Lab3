package ca.ucalgary.ensf380;

public class Anthology extends Fiction {
    public Anthology(String ISBN, int numPages) {
        super(ISBN, numPages);
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Anthology";
    }

    @Override
    public String genre() {
        return "Method genre called from Fiction";
    }
}
