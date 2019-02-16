package com.kodilla.exception.test;

public class RouteSearchEngineRunner {
    public static void main(String[] args) {
        Flight warsawToLondon = new Flight("Warsaw", "London");
        Flight warsawToSydney = new Flight("Warsaw", "Sydney");
        Flight berlinToLondon = new Flight("Berlin", "London");
        Flight berlinToParis = new Flight("Berlin", "Paris" );

        RouteSearchEngine routeSearchEngine = new RouteSearchEngine();

            try {
                boolean verifyWarsawToLondon = routeSearchEngine.findFlight(warsawToLondon);
                System.out.println("Flight Warsaw to London: " + verifyWarsawToLondon);
            } catch (RouteNotFoundException e) {
                System.out.println("Please choose correct route.");
            } finally {
                System.out.println("Flight is scheduled for 14:17.\n");
            }


            try {
                boolean verifyWarsawToSydney = routeSearchEngine.findFlight(warsawToSydney);
                System.out.println("Flight Warsaw to Sydney: " + verifyWarsawToSydney);
            } catch (RouteNotFoundException e) {
                System.out.println("Please choose correct route.");
            } finally {
                System.out.println("Flight is scheduled for 09:31.\n");


            try {
                boolean verifyBerlinToLondon = routeSearchEngine.findFlight(berlinToLondon);
                System.out.println("Flight Berlin to London: " + verifyBerlinToLondon);
            } catch (RouteNotFoundException e) {
                System.out.println("Please choose correct route.");
            } finally {
                System.out.println("Flight is scheduled for 22:04.\n");
            }

            try {
                boolean verifyBerlinToParis = routeSearchEngine.findFlight(berlinToParis);
                System.out.println("Flight Berlin to Paris: " + verifyBerlinToParis);
            } catch (RouteNotFoundException e) {
                System.out.println("Please choose correct route.");
            } finally {
                System.out.println("Flight is scheduled for 00:22.\n");
            }
        }
    }
}