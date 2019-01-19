package com.kodilla.spring.good.patterns.airline_95.airports;

public class Berlin extends Airport {

    Berlin() {
        availableDestination.put("Wroclaw", true);
        availableDestination.put("London", false);
        availableDestination.put("Berlin", false);
        availableDestination.put("Sydney", false);
        availableDestination.put("Paris", true);
        availableDestination.put("Washington", true);
        this.name = "Berlin";
    }
}
