package com.kodilla.good.patterns.airline_95.airports;

public class Washington extends Airport {

    Washington() {
        availableDestination.put("Wroclaw", false);
        availableDestination.put("London", true);
        availableDestination.put("Berlin", true);
        availableDestination.put("Sydney", true);
        availableDestination.put("Paris", false);
        availableDestination.put("Washington", false);
        this.name = "Washington";
    }
}