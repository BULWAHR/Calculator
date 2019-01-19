package com.kodilla.spring.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteSearchEngine {

    private final Map<String, Boolean> flightMap;

    public RouteSearchEngine() {
        flightMap = flightRoutes();
    }

    private Map<String, Boolean> flightRoutes() {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("London", true);
        airports.put("Warsaw", false);
        airports.put("Sydney", false);
        airports.put("Berlin", true);

        return airports;
    }

    private boolean findRoute(String destination) throws RouteNotFoundException {
        if (flightMap.containsKey(destination)) {
            return flightMap.get(destination);
        } else {
            throw new RouteNotFoundException("Destination invalid.");
        }
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findRoute(flight.getArrivalAirport()) && findRoute(flight.getDepartureAirport());
    }
}

