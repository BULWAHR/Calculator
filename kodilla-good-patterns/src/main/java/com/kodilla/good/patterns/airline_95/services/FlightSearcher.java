package com.kodilla.good.patterns.airline_95.services;

public class FlightSearcher {

    private static final DirectFlight directFlight = new DirectFlight();
    private static final IndirectFlight indirectFlight =  new IndirectFlight();

    public static void process(Flight flight) {
        if(directFlight.searchFlight(flight)) {
            System.out.println("There is direct flight to chosen destination.");
            return;
        }
        System.out.println("No direct flights available to chosen destination.");

        if(indirectFlight.searchFlight(flight)) {
            return;
        }
        System.out.println("No flights available to chosen destination.");
    }
}
