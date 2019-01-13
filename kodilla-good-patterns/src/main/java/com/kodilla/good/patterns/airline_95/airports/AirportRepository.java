package com.kodilla.good.patterns.airline_95.airports;

import java.util.ArrayList;
import java.util.List;

public class AirportRepository {

    private List<Airport> airportList = new ArrayList<>();

    public AirportRepository() {
        airportList.add(new Wroclaw());
        airportList.add(new Berlin());
        airportList.add(new London());
        airportList.add(new Paris());
        airportList.add(new Sydney());
        airportList.add(new Washington());
    }

    public List<Airport> getAirportList() {
        return airportList;
    }
}
