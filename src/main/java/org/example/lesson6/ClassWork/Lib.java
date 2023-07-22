package org.example.lesson6.ClassWork;

import java.util.ArrayList;
import java.util.List;

public class Lib implements Searchable {
    private List<Book> listBook = new ArrayList<>();

    public Lib(List<Book> lostBook) {
        this.listBook = lostBook;
    }

    public Lib() {
    }

    public List<Book> getListBook() {
        return listBook;
    }

    public void setListBook(List<Book> listBook) {
        this.listBook = listBook;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> resList = new ArrayList<>();
        for (Book book : listBook) {
            if (book.getAuthor().equals(author))
                resList.add(book);
        }
        return resList;
    }
}
