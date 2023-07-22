package org.example.lesson6.ClassWork;

public class BookGenre implements Genre{
    String bookGenre;

    public BookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String getGenre() {
        return bookGenre;
    }

    @Override
    public String toString() {
        return bookGenre;
    }
}
