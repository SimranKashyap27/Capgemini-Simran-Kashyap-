package flightsearch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import flightsearch.model.Flight;
import flightsearch.model.Search;

@Service
public interface FlightSearchService {

	List<Flight> getFlights(Search search);

}
