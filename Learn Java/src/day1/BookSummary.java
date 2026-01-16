package day1;

public class BookSummary {
    static void main(String[] args) {
        String title = "The Great Gatsby";
        int pages = 180;
        double price = 15.99;

        System.out.printf("Title: %s%nPages: %d%nPrice: $%.2f%n", title, pages, price);
    }
}
