package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.models.CatalogItem;
import io.javabrains.moviecatalogservice.models.Movie;
import io.javabrains.moviecatalogservice.models.Rating;
import io.javabrains.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        //WebClient.Builder builder = WebClient.builder();

      //  RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getForObject("http://localhost:8081/movies/foo", Movie.class);

     /*   List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 3)
        );*/

        //UserRating ratings = restTemplate.getForObject("http://localhost:8082/ratingsdata/users/" + userId, UserRating.class);
    //eureka
        UserRating ratings = restTemplate.getForObject("http://ratings-data-service/ratingsdata/users/" + userId, UserRating.class);

        return ratings.getUserRating().stream().map(rating -> {
//            Movie movie = restTemplate.getForObject("http://localhost:8081/movies/foo" + rating.getMovieId(), Movie.class);
//eureka
            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/foo" + rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getName(), "Desc", rating.getRating());
        })
                .collect(Collectors.toList());

            /*Movie movie = webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8081/movies/" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();*/

        //get all rated movie IDs

        ///For each movie ID, call movie info service and get details

        //Put them all together
        // return Collections.singletonList(
//                new CatalogItem("Transformers", "Test", 4)
//        );
    }
}
