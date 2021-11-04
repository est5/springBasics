package com.example.restbasic.controller;

import com.example.restbasic.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //instead of @ResponseBody(no view) for each method
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        Country c = Country.of("France", 67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "wine")
                .body(c);
    }

    @GetMapping("/all")
    public List<Country> countries(){
        Country c1 = Country.of("Russia", 1337);
        Country c2 = Country.of("Norway", 1488);
        return List.of(c1, c2);
    }
}
