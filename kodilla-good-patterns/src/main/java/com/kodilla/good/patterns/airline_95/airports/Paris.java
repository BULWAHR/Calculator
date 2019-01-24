package com.kodilla.good.patterns.airline_95.airports;

public class Paris extends Airport {

    Paris() {
        availableDestination.put("Wroclaw", true);
        availableDestination.put("London", true);
        availableDestination.put("Berlin", false);
        availableDestination.put("Sydney", false);
        availableDestination.put("Paris", false);
        availableDestination.put("Washington", false);
        this.name = "Paris";
    }
}
