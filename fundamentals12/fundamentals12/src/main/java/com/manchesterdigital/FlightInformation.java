package com.manchesterdigital;

import java.util.Optional;

public class FlightInformation {

    // Variables
    private final String flightNo;
    private String destination;
    private Optional<Airline> airline;

    // Constructor
    public FlightInformation(String flightNo) {
        this.flightNo = flightNo;
    }

    // Getters
    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }


    public Optional<Airline> getAirline() {
        return airline;
    }

    // Setters
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAirline(Optional<Airline> airline) {
        this.airline = airline;
    }
}
