package com.example.spring.repository;
import com.example.spring.Entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeerRepository extends JpaRepository<Beer, Long> {
    List<Beer> getBeerByName(String name);
    List<Beer> findAll();
}
