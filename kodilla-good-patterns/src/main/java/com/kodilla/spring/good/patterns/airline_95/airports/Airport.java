package com.kodilla.spring.good.patterns.airline_95.airports;

import java.util.HashMap;
import java.util.Map;

public abstract class Airport {

    public Map<String, Boolean> availableDestination = new HashMap();
    public String name;

    public Map<String, Boolean> getAvailableDestination() {
        return availableDestination;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (!availableDestination.equals(airport.availableDestination)) return false;
        return name.equals(airport.name);
    }

    @Override
    public int hashCode() {
        int result = availableDestination.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}

