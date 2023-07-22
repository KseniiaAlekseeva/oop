package org.example.lesson6.ClassWork;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {

        Lib lib = new Lib(Arrays.asList(new Book("qwe1", "asd", 1992, new BookGenre("novelle")),
                new Book("qwe2", "asd1", 1922, new BookGenre("novelle")),
                new Book("qwe3", "asd", 1920, new BookGenre("roman"))));

        System.out.println("lib.searchByAuthor(\"asd\") = " + lib.searchByAuthor("asd").toString());

        Formatter formatter = new JsonFormatter(); // инверсия зависимости
        formatter.format(lib.getListBook());

    }
}
