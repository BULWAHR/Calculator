package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> coutriesOnContinent = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public boolean addCountry(Country country) {
        return coutriesOnContinent.add(country);
    }

    public List<Country> getCountriesOnContinent() {
        return new ArrayList<>(coutriesOnContinent);
    }

    public String getContinentName() {
        return continentName;
    }
}
