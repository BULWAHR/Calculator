package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Library library = new Library("Library");
        Book book1 = new Book("Book 1", "Author 1", LocalDate.of(2002, Month.OCTOBER, 7));
        Book book2 = new Book("Book 2", "Author 2", LocalDate.of(2003, Month.DECEMBER, 24));
        Book book3 = new Book("Book 3", "Author 3", LocalDate.of(2009, Month.FEBRUARY, 19));
        Book book4 = new Book("Book 4", "Author 4", LocalDate.of(2010, Month.AUGUST, 1));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Library libraryCopy = null;
        try {
            libraryCopy = library.shallowCopy();
            libraryCopy.setName("Library - shallow copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deeplibraryCopy = null;
        try {
            deeplibraryCopy = library.deepCopy();
            deeplibraryCopy.setName("Library - deep copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        library.removeBook(book4);

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, libraryCopy.getBooks().size());
        Assert.assertEquals(4, deeplibraryCopy.getBooks().size());
    }
}