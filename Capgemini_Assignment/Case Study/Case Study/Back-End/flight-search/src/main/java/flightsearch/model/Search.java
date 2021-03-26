package flightsearch.model;

import com.sun.istack.NotNull;

public class Search {
	
	@NotNull
	private String departureAirport;
	@NotNull
	private String destinationAirport;
	
	public Search(String departureAirport, String destinationAirport) {
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
	}
	
	public String getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
	
}
