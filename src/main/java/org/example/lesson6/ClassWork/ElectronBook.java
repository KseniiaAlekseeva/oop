package org.example.lesson6.ClassWork;

public class ElectronBook extends Book{
    private String format;
    private int size;

    public ElectronBook(String name, String author, int year, String format, BookGenre genre, int size) {
        super(name, author, year, genre);
        this.format = format;
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
