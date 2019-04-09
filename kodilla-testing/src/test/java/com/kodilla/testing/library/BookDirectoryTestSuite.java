package com.kodilla.testing.library;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class BookDirectoryTestSuite {

//    private static int testCounter = 0;
//
//    private LibraryDatabase libraryDatabaseMock;
//    private BookLibrary bookLibrary;
//
//    @BeforeClass
//    public static void beforeAllTests() {
//        System.out.println("=== Tests begin. ===");
//    }
//
//    @AfterClass
//    public static void afterAllTests() {
//        System.out.println("=== All tests are finished. ===");
//    }
//
//
//    @Before
//    public void before() {
//        libraryDatabaseMock = mock(LibraryDatabase.class);
//        bookLibrary = new BookLibrary(libraryDatabaseMock);
//
//        testCounter++;
//        System.out.println("Executing test #" + testCounter);
//    }
//
//    @After
//    public void after() {
//        System.out.println("Test ended");
//    }
//
//
//    private List<Book> listOfBooks(int booksNumber) {
//        List<Book> theBookList = new ArrayList<Book>();
//        for (int n = 1; n <= booksNumber; n++) {
//            Book theBook = new Book("Title " + n, "Author " + n, 2000 + n);
//            theBookList.add(theBook);
//        }
//        return theBookList;
//    }
//
//    @Test
//    public void testWithZeroBooks() {
//
//        List<Book>listOfZeroBooks = new ArrayList<>();
//        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOfZeroBooks);
//
//        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(isA(LibraryUser.class));
//
//        assertEquals(0, resultListBooksInHandsOf.size());
//        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(any(LibraryUser.class));
//    }
//
//    @Test
//    public void testWithOneBook() {
//
//        List<Book> listOfOneBook = listOfBooks(1);
//        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOfOneBook);
//
//        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(isA(LibraryUser.class));
//
//        assertEquals(1, resultListBooksInHandsOf.size());
//        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(any(LibraryUser.class));
//    }
//
//    @Test
//    public void testWithFiveBooks() {
//
//        List<Book> listOfFiveBooks = listOfBooks(5);
//        when(libraryDatabaseMock.listBooksInHandsOf(any(LibraryUser.class))).thenReturn(listOfFiveBooks);
//
//        List<Book> resultListBooksInHandsOf = bookLibrary.listBooksInHandsOf(isA(LibraryUser.class));
//
//        assertEquals(5, resultListBooksInHandsOf.size());
//        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(any(LibraryUser.class));
//    }
//
//    @Test
//    public void testListBooksWithConditionsReturnList() {
//        // Given
//        List<Book> resultListOfBooks = new ArrayList<Book>();
//        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
//        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
//        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
//        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
//        resultListOfBooks.add(book1);
//        resultListOfBooks.add(book2);
//        resultListOfBooks.add(book3);
//        resultListOfBooks.add(book4);
//        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
//                .thenReturn(resultListOfBooks);
//
//        // When
//        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
//
//        // Then
//        assertEquals(4, theListOfBooks.size());
//    }
//
//    @Test
//    public void testListBooksWithConditionMoreThan20() {
//        // Given
//        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
//
//        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
//
//        List<Book> resultListOf0Books = new ArrayList<Book>();
//        List<Book> resultListOf15Books = listOfBooks(15);
//        List<Book> resultListOf40Books = listOfBooks(40);
//        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
//                .thenReturn(resultListOf15Books);
//        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
//                .thenReturn(resultListOf0Books);
//        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
//                .thenReturn(resultListOf40Books);
//
//        // When
//        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
//        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
//        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
//        // Then
//
//        assertEquals(0, theListOfBooks0.size());
//        assertEquals(15, theListOfBooks15.size());
//        assertEquals(0, theListOfBooks40.size());
//    }
//
//    @Test
//    public void testListBooksWithConditionFragmentShorterThan3() {
//        // Given
//        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
//        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
//        List<Book> resultListOf10Books = listOfBooks(10);
//        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
//                .thenReturn(resultListOf10Books);
//
//        // When
//        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");
//
//        // Then
//        assertEquals(0, theListOfBooks10.size());
//        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
//    }
}