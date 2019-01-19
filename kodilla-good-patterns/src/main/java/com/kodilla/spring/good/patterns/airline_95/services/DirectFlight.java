package com.kodilla.spring.good.patterns.airline_95.services;

import com.kodilla.spring.good.patterns.airline_95.airports.AirportRepository;

import java.util.List;
import java.util.stream.Collectors;

public class DirectFlight {

    private AirportRepository airportRepository = new AirportRepository();

    boolean searchFlight(Flight flight) {
        return searchFlight(flight.getDepartureAirport(), flight.getArrivalAirport());
    }

    boolean searchFlight(String departureAirport, String arrivalAirport) {
        List<Boolean> temporaryList = airportRepository.getAirportList().stream()
                .filter(n -> n.getName().equals(departureAirport))
                .map(n -> n.getAvailableDestination())
                .map(n -> n.get(arrivalAirport))
                .collect(Collectors.toList());

        if(! temporaryList.isEmpty()) {
            return temporaryList.get(0);
        }
        else
            return false;
    }
}
