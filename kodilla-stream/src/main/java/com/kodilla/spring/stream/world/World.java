package com.kodilla.spring.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continentsInTheWorld = new ArrayList<>();

    public boolean addContinent(Continent continent) {
        return continentsInTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleInTtheWorld = continentsInTheWorld.stream()
                .flatMap(continent -> continent.getCountriesOnContinent().stream())
                .distinct()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, country) -> sum.add(country));

        return peopleInTtheWorld;
    }
}
