package org.example;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private static int totalCount = 0;
    private int instanceCount = 0;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    public String getTitle() {
        return title;
    }

    public static void setTotalCount(int totalCount) {
        Book.totalCount = totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}'+'\n'
                + "totalCount: " + totalCount
                +"\ninstanceCount: " + instanceCount
                +"\n";
    }
}
