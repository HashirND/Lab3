package ca.ucalgary.ensf380;

public abstract class Book {
    private String ISBN;
    private int numPages;

    public Book(String ISBN, int numPages) {
        this.ISBN = ISBN;
        this.numPages = numPages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public abstract String coverArt(); // has to be abstract method implentation
}
