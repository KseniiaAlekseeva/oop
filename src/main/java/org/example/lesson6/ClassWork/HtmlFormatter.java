package org.example.lesson6.ClassWork;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public void format(List<Book> listBook) {
        for (Book book : listBook) {
            System.out.println("Book " + book.toString() + " converted to format: " + Format.HTML);
        }
    }

}
