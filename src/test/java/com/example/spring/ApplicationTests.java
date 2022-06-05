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
		Beer beer = Beer.builder()
				.name("에일 맥주").rate("rate 기준 2.03").des("맛이 좋습니다.").image("https://lh5.googleusercontent.com/xPKl3x_TAzJY6uTTW3q1Y0K50mhdcKi0T81ut5sanMiHJ7DIz_QB2deGILSv5xzq0iJ6stsHB-NI2F6R45MHychFUNfFiNGuVMrn08rgEBxZYtMtq7eBhvIAFDFbsJZ0aax0amkDY2G_dTO4Fw").link("이 링크에 가시면 더 정보를 확인할 수 있습니다.").build();
		Beer beer2 = Beer.builder()
				.name("에일 맥주2").rate("rate 기준 2.03").des("맛이 좋습니다.").image("https://lh5.googleusercontent.com/xPKl3x_TAzJY6uTTW3q1Y0K50mhdcKi0T81ut5sanMiHJ7DIz_QB2deGILSv5xzq0iJ6stsHB-NI2F6R45MHychFUNfFiNGuVMrn08rgEBxZYtMtq7eBhvIAFDFbsJZ0aax0amkDY2G_dTO4Fw").link("이 링크에 가시면 더 정보를 확인할 수 있습니다.").build();
		Beer beer3 = Beer.builder()
				.name("에일 맥주3").rate("rate 기준 2.03").des("맛이 좋습니다.").image("https://lh5.googleusercontent.com/xPKl3x_TAzJY6uTTW3q1Y0K50mhdcKi0T81ut5sanMiHJ7DIz_QB2deGILSv5xzq0iJ6stsHB-NI2F6R45MHychFUNfFiNGuVMrn08rgEBxZYtMtq7eBhvIAFDFbsJZ0aax0amkDY2G_dTO4Fw").link("이 링크에 가시면 더 정보를 확인할 수 있습니다.").build();

		beerRepository.save(beer);
		beerRepository.save(beer2);
		beerRepository.save(beer3);
	}

}
