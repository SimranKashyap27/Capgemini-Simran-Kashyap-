package flightsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flightsearch.dao.FlightSearchRepo;
import flightsearch.model.Flight;
import flightsearch.model.Search;

@Service
public class FlightSearchServiceImpl implements FlightSearchService {

	@Autowired
	private FlightSearchRepo flightSearchRepo;

	public List<Flight> getFlights(Search search) {
		
		return flightSearchRepo.findByDepaDest(search.getDepartureAirport(), search.getDestinationAirport());
		
	} 
}
