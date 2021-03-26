package flightsearch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {
	@Id
	private String Id;
	private String flightName;
	private String departureAirport;
	private String destinationAirport;
    private String departureDate;
    private String arrivalDate;
	private String departureTime;
    private String arrivalTime;
	
    
    public Flight() {}
    
    public Flight(String id, String flightName, String departureAirport, String destinationAirport,
			String departureDate, String arrivalDate, String departureTime, String arrivalTime) {
		Id = id;
		this.flightName = flightName;
		this.departureAirport = departureAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
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
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
    
    
	

}
