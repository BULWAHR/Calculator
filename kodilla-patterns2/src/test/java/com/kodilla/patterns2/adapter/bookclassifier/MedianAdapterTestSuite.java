package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianTest() {

        Book Book1 = new Book("Author 1", "Title 1",2002, "A1/T1/2002");
        Book Book2 = new Book("Author 2", "Title 2",2006, "A2/T2/2006");
        Book Book3 = new Book("Author 3", "Title 3",2000, "A3/T3/2000");
        Book Book4 = new Book("Author 4", "Title 4",2010, "A4/T4/2010");
        Book Book5 = new Book("Author 5", "Title 5",2005, "A5/T5/2005");

        HashSet<Book> library = new HashSet<>();
        library.add(Book1);
        library.add(Book2);
        library.add(Book3);
        library.add(Book4);
        library.add(Book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        int publicationYearMedian = medianAdapter.publicationYearMedian(library);

        System.out.println(publicationYearMedian);
        assertEquals(2005, publicationYearMedian, 0);
    }
}