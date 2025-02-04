package org.example;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void addBook(Book newBook) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = newBook;
    }

    public void deleteBook(String title) {
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Book[] newBooks = new Book[books.length - 1];
            System.arraycopy(books, 0, newBooks, 0, index);
            System.arraycopy(books, index + 1, newBooks, index, books.length - index - 1);
            books = newBooks;
        }
    }


    @Override
    public String toString() {
        return "Library {\n" +
                "books=\n" + Arrays.toString(books) +
                '}';
    }
}
