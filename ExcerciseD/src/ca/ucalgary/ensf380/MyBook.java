package ca.ucalgary.ensf380;

public class MyBook {
    public static void main(String[] args) {
        // publisher publsihes classic books
        Novel novel1 = new Novel("1122334455", 369);
        Anthology anthology1 = new Anthology("23232123123", 100);
        Nonfiction nonfiction1 = new Nonfiction("23123213132", 150);

        System.out.println(novel1.coverArt()); 
        System.out.println(anthology1.coverArt()); 
        System.out.println(nonfiction1.coverArt()); 

        System.out.println(novel1.genre()); 
        System.out.println(anthology1.genre()); 
        System.out.println(nonfiction1.topic());
    }
}
