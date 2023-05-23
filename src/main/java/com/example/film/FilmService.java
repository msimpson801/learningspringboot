package com.example.film;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FilmService {
    private List <FilmModel> filmList = Stream.of(
            new FilmModel("The Godfather", "Francis Ford Copolla", 5),
            new FilmModel("Goodfellas", "Martin Scorsese", 5)
    ).collect(Collectors.toList());

    public FilmModel getFilmByTitle(String title) {

        return filmList.stream()
                .filter(film -> title.replace("_", " ").equalsIgnoreCase(film.getTitle()))
                .findFirst()
                .orElseThrow(() -> new FilmNotFoundException("No film of this name found"));
    }
}
