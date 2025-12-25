import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args){
        // display all Book enum constants
        System.out.println("All books:");
        for (Book book : Book.values()) {
            System.out.printf("%-5s: %s%n", book, book.getTitle());
        }

        // display specified range of Book enum constants
        System.out.println("\nBooks from CHTP to VBHTP:");
        for (Book book : EnumSet.range(Book.CHTP, Book.VBHTP)) {
            System.out.printf("%-5s: %s%n", book, book.getTitle());
        }
    }
}