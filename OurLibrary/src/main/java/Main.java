import database.DatabaseConnectionFactory;
import database.JDBConnectionWrapper;
import model.Book;
import model.builder.BookBuilder;
import repository.BookRepository;
import repository.BookRepositoryMock;
import repository.BookRepositoryMySQL;
import service.BookService;
import service.BookServiceImpl;

import java.sql.Connection;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Book book = new Book();
        book.setAuthor("J.K. Rowling");
        book.setTitle("Harry Potter");

        System.out.println(book);



        Book framBook = new BookBuilder()
                .setTitle("Fram Ursul Polar")
                .setId(1L)
                .setAuthor("', '', null); DROP TABLE book; -- ")
                .setPublishedDate(LocalDate.of(1940, 01, 01))
                .build();

        System.out.println(framBook);

        JDBConnectionWrapper jdbConnectionWrapper = DatabaseConnectionFactory.getConnectionWrapper(false);
        Connection connection = jdbConnectionWrapper.getConnection();

        BookRepository bookRepository = new BookRepositoryMySQL(connection);
        BookService bookService = new BookServiceImpl(bookRepository);
        bookService.save(framBook);
        System.out.println(bookService.findAll());


    }
}
