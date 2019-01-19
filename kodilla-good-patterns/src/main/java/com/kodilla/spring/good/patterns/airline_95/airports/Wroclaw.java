package com.kodilla.spring.good.patterns.airline_95.airports;

public class Wroclaw extends Airport {

     Wroclaw() {
        availableDestination.put("Wroclaw", false);
        availableDestination.put("London", true);
        availableDestination.put("Berlin", true);
        availableDestination.put("Sydney", false);
        availableDestination.put("Paris", false);
        availableDestination.put("Washington", true);
        this.name = "Wroclaw";
    }
}
