import model.Book;
import model.builder.BookBuilder;

public class Main {
    public static void main(String[] args){
        Book book = new Book();
        book.setAuthor("J.K. Rowling");
        book.setTitle("Harry Potter");

        System.out.println(book);



        Book framBook = new BookBuilder()
                .setTitle("Fram Ursul Polar")
                .setId(1L)
                .setAuthor("Cezar Petrescu")
                .build();

        System.out.println(framBook);


    }
}
