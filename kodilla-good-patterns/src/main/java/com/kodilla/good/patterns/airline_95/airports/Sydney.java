package com.kodilla.good.patterns.airline_95.airports;

public class Sydney extends Airport {

    Sydney() {
        availableDestination.put("Wroclaw", false);
        availableDestination.put("London", true);
        availableDestination.put("Berlin", true);
        availableDestination.put("Sydney", false);
        availableDestination.put("Paris", false);
        availableDestination.put("Washington", true);
        this.name = "Sydney";
    }
}
