package org.example.lesson6.ClassWork;

import java.util.List;

public class JsonFormatter implements Formatter {
    @Override
    public void format(List<Book> listBook) {
        for (Book book : listBook) {
            System.out.println(book.toString() + " converted to format: " + Format.JSON);
        }
    }
}
