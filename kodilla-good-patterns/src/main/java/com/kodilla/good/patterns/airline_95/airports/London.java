package com.kodilla.good.patterns.airline_95.airports;

public class London extends Airport {

     London() {
        availableDestination.put("Wroclaw", false);
        availableDestination.put("London", false);
        availableDestination.put("Berlin", false);
        availableDestination.put("Sydney", true);
        availableDestination.put("Paris", false);
        availableDestination.put("Washington", true);
        this.name = "London";
    }
}
