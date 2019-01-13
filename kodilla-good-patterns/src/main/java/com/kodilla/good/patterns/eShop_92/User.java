package com.kodilla.good.patterns.eShop_92;

public class User {
    private String userNickname;
    private String Name;
    private String Surname;

    public User(String userNickname, String Name, String Surname) {
        this.userNickname = userNickname;
        this.Name = Name;
        this.Surname = Surname;
    }

    public String getNickname() {
        return userNickname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }
}
