package com.example.spring.controller;

import com.example.spring.Entity.Beer;
import com.example.spring.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BeerController {

    BeerRepository beerRepository;

    @Autowired
    BeerController(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @GetMapping(value = "beer")
    public Beer getBeerByName(@RequestParam String name, Model model) {
        Beer beer = (Beer) beerRepository.getBeerByName(name);
        return beer;
    }
    @GetMapping(value = "beer/id")
    public Beer getBeerById(@RequestParam Integer id, Model model) {
        Beer beer = (Beer) beerRepository.getBeerById(id);
        return beer;
    }

    @GetMapping(value = "beers")
    public ArrayList<Beer> getBeers(@RequestParam(required = false) String type, @RequestParam(required = false) Integer count, Model model) {
        ArrayList<Beer> beers = (ArrayList<Beer>) beerRepository.findAll();
        return beers;
    }
}
