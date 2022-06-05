package com.example.spring.controller;

import com.example.spring.domain.Beer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BeerController {

    @GetMapping(value = "beer")
    public Beer getBeerByName(@RequestParam String name, Model model) {
        Beer beer = new Beer(name, "rate", "des", "image", "link");
        return beer;
    }
    @GetMapping(value = "beers")
    public ArrayList<Beer> getBeers(@RequestParam(required = false) String type, Model model) {
        ArrayList<Beer> beers = new ArrayList<>();
        Beer beer = new Beer("name", "rate", "des", "image", "link");
        beers.add(beer);
        beers.add(beer);
        beers.add(beer);
        beers.add(beer);
        beers.add(beer);
        return beers;
    }
}
