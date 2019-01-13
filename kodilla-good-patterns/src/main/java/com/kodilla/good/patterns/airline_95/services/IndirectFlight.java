package com.kodilla.good.patterns.airline_95.services;

import com.kodilla.good.patterns.airline_95.airports.AirportRepository;

import java.util.List;
import java.util.stream.Collectors;

public class IndirectFlight {
    private AirportRepository airportRepository = new AirportRepository();
    private DirectFlight directFlight = new DirectFlight();

    boolean searchFlight(Flight flight){
        List<String> temporaryList = airportRepository.getAirportList().stream()
                .filter(n -> n.getName().equals(flight.getDepartureAirport()) )
                .flatMap(n -> n.getAvailableDestination().entrySet().stream())
                .filter(n -> n.getValue())
                .map(n -> n.getKey())
                .collect(Collectors.toList());

        for(int i = 0; i < temporaryList.size(); i++){

            if(directFlight.searchFlight(flight.getDepartureAirport(), temporaryList.get(i))){
                System.out.println("Possible indirect flight through " + temporaryList.get(i) + ".");
                return true;
            }
        }
        return false;
    }
}