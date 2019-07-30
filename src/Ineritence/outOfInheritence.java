package Ineritence;

import ObjectCreation.Book;

public class outOfInheritence extends Books {

    public static void main(String[] args) {
        Books books = new Books();
        books.setName("Java");
        books.setPrice(1500);
        books.display();
    }
}
