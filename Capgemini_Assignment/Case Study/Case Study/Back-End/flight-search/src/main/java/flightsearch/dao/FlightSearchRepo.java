package flightsearch.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import flightsearch.model.Flight;

@Repository
public interface FlightSearchRepo extends JpaRepository<Flight, Integer> {

	@Query(value = "SELECT * FROM FLIGHT WHERE departure_Airport=:departureAirport AND destination_Airport=:destinationAirport", nativeQuery = true)
	List<Flight> findByDepaDest(@Param("departureAirport") String departureAirport,
			@Param("destinationAirport") String destinationAirport);
}
