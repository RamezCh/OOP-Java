package org.example;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", "C350", "Schwarz", 2025);
        BMW.startCar();
        System.out.println("The car running with a speed of " + BMW.accelerateCar());
        Person ramez = new Person("Ramez", "male", 25);
        ramez.introduce();

        Book java = new Book("Introduction to Java", "Java Author", "12312412Java");
        Book python = new Book("Introduction to Python", "Python Author", "12312412Python");
        Book c = new Book("Introduction to C", "C Author", "12312412C");

        System.out.println(java);
        System.out.println(python.getTitle());
        c.setIsbn("C123123123C");
        System.out.println(c.getIsbn());
        Book[] bookArr = {java, python, c};
        Library library = new Library(bookArr);
        System.out.println(library);
        library.deleteBook("Introduction to C");
        System.out.println(library);

    }
}