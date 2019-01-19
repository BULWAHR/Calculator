package com.kodilla.spring.good.patterns.airline_95;

import com.kodilla.spring.good.patterns.airline_95.services.Flight;
import com.kodilla.spring.good.patterns.airline_95.services.FlightSearcher;

public class FLIGHTRunner {

    public static void main(String[] args) {
        Flight flight = new Flight("Wroclaw", "Sydney");
        FlightSearcher.process(flight);
    }
}

