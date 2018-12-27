package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "John Smith", 'M', LocalDate.of(1995, 2, 24), 12));
        forumUserList.add(new ForumUser(2, "Dorothy Newman", 'F', LocalDate.of(2007, 4, 15), 33));
        forumUserList.add(new ForumUser(3, "John Wolkowitz", 'M', LocalDate.of(1990, 8, 28), 92));
        forumUserList.add(new ForumUser(4, "Lucy Riley", 'F', LocalDate.of(1993, 11, 20), 5));
        forumUserList.add(new ForumUser(5, "Owen Rogers", 'M', LocalDate.of(2004, 12, 31), 89));
        forumUserList.add(new ForumUser(6, "Matilda Davies", 'F', LocalDate.of(1991, 5, 13), 31));
        forumUserList.add(new ForumUser(7, "Declan Booth", 'M', LocalDate.of(1984, 10, 4), 143));
        forumUserList.add(new ForumUser(8, "Corinne Foster", 'F', LocalDate.of(2000, 1, 1), 1));
        forumUserList.add(new ForumUser(9, "Khloe fry", 'F', LocalDate.of(1994, 9, 3), 29));
        forumUserList.add(new ForumUser(10, "Martin Valenzuela", 'M', LocalDate.of(1998, 6, 22), 73));
        }

        public List<ForumUser>getForumUserList() {
            return new ArrayList<>(forumUserList);
        }
}