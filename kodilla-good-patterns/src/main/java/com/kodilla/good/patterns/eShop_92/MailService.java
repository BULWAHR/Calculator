package com.kodilla.good.patterns.eShop_92;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Thank You " + user.getName() + " " +  user.getSurname() + " for your purchase.");
    }
}