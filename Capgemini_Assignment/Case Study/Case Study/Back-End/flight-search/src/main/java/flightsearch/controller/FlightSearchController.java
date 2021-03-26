package flightsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import flightsearch.model.Flight;
import flightsearch.model.Search;
import flightsearch.service.FlightSearchService;

@RestController
public class FlightSearchController {

	@Autowired
	private FlightSearchService flightSearchService;

	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public List<Flight> getFlightDetail(@RequestBody Search search) {

		return flightSearchService.getFlights(search);
	}

}
