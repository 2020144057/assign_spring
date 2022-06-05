package com.example.spring;

import com.example.spring.Entity.Beer;
import com.example.spring.repository.BeerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class ApplicationTests {

	@Autowired
	BeerRepository beerRepository;

	@Test
	void 와인저장하기() {
//		Beer beer = Beer.builder()
//				.name("에일 맥주").rate("존나 맛있음").des("에이 에일 맥주는 아니다").image("imagei s fewfw").link("wfefwe").foods("씨발 왜 아무도 안 적냐고").build();
//
//		beerRepository.save(beer);
//		beer = Beer.builder()
//				.name("에일 맥주2").rate("존나 맛있음").des("에이 에일 맥주는 아니다").image("imagei s fewfw").link("wfefwe").foods("씨발 왜 아무도 안 적냐고").build();
//		beerRepository.save(beer);
//
//		ArrayList<Beer> beers = (ArrayList<Beer>) beerRepository.findAll();
//		for (int i = 0; i < 2; i++) {
//			System.out.println(beers.get(i).getName());
//		}

	}

}
