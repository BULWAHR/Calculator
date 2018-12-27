package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent( "Asia");
        Continent africa = new Continent( "Africa");

        Country poland = new Country("Poland");
        Country germany = new Country("Germany");
        Country uk = new Country("UK");
        Country china = new Country("China");
        Country japan = new Country("Japan");
        Country rpa = new Country("RPA");
        Country morocco = new Country("Morocco");
        Country nigeria = new Country("Nigeria");

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(africa);

        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(uk);
        asia.addCountry(china);
        asia.addCountry(japan);
        africa.addCountry(rpa);
        africa.addCountry(morocco);
        africa.addCountry(nigeria);

        europa.addCountry(nigeria);
        asia.addCountry(poland);
        africa.addCountry(rpa);  // zdublowane colowo


        BigDecimal peopleInTheWorld = world.getPeopleQuantity();

        BigDecimal peopleExpected = new BigDecimal("88888888");
        Assert.assertEquals(peopleExpected, peopleInTheWorld);

        }
}
