package model.builder;

import model.Book;

import java.util.Date;

public class BookBuilder {

    private Book book;

    public BookBuilder(){
        this.book = new Book();
    }

    public BookBuilder setId(Long id){
        this.book.setId(id);
        return this;
    }

    public BookBuilder setTitle(String title){
        this.book.setTitle(title);
        return this;
    }

    public BookBuilder setAuthor(String author){
        this.book.setAuthor(author);
        return this;
    }

    public BookBuilder setPublishedDate(Date publishedDate){
        this.book.setPublishedDate(publishedDate);
        return this;
    }

    public Book build(){
        return book;
    }
}
