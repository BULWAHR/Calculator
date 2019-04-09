package com.kodilla.testing.library;

public class LibraryConfig {

    public Library library() {
        return new Library(libraryDbController());
    }


    public LibraryDbController libraryDbController() {
        return new LibraryDbController();
    }
}