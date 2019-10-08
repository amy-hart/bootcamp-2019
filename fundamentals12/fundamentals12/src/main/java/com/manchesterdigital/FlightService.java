package com.manchesterdigital;

import java.util.Map;

public class FlightService {
    private static Map<String, FlightInformation> flights;

    static {
        flights = Map.of(
                "AB123", new FlightInformation("AB123"),
                "XK345", new FlightInformation("XK345"),
                "ST009", new FlightInformation("ST009")
        );
    }

    public FlightInformation retrieveFlight(final String flightNo) {
        return flights.get(flightNo);
    }

    // Good solution but not the best
    /*
    public Airline retrieveAirline(final String flightNo) {
        FlightInformation flight = retrieveFlight(flightNo);

        if (flight.getAirline().isEmpty()){
            throw new AirlineNotFoundException();
        }

        return flight.getAirline().get();
    }
    */

    public Airline retrieveAirline(final String flightNo) {
        FlightInformation flight = retrieveFlight(flightNo);

        //return flight.getAirline().orElseThrow(AirlineNotFoundException::new);
        //return flight.getAirline().orElseThrow(() -> new AirlineNotFoundException("No flight found"));
        // Provide default
        return flight.getAirline().orElse(new Airline());

    }
}
