package ca.ucalgary.ensf380;

public class Novel extends Fiction {
    public Novel(String ISBN, int numPages) {
        super(ISBN, numPages);
    }

    @Override
    public String coverArt() {
        return "Method coverArt called from Novel";
    }

    @Override
    public String genre() {
        return "Method genre called from Fiction";
    }
}
