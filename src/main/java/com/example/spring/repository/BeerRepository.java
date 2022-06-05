package com.example.spring.repository;
import com.example.spring.Entity.Beer;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class BeerRepository {
    private final EntityManager em;

    public BeerRepository(EntityManager em) {
        this.em = em;
    }

    public Beer save(Beer beer) {
        em.persist(beer);
        return beer;
    }

    public Optional<Beer> findByName(String name) {
        List<Beer> result = em.createQuery("select b from Beer b where b.name = :name", Beer.class)
                .setParameter("name", name)
                .getResultList();

        return result.stream().findAny();
    }
}
