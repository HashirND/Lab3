package ca.ucalgary.ensf380;

public abstract class Fiction extends Book {
    public Fiction(String ISBN, int numPages) {
        super(ISBN, numPages);
    }

    public abstract String genre(); // has to be abstract method implentation
}
