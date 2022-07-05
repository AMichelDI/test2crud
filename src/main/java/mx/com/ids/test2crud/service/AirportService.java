package mx.com.ids.test2crud.service;

import mx.com.ids.test2crud.model.Airport;

import java.util.List;

public interface AirportService {

    Airport createAirport(Airport airport);

    Airport updateAirport(Airport airport);

    List<Airport> getAllAirports();

    Airport getAirportById(long airportId);

    void deleteAirport(long id);

}
