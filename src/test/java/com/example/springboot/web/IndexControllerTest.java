package com.example.springboot.web;

import static org.assertj.core.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)
class IndexControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	@DisplayName("메인페이지를 로드한다")
	void index() {
		// when
		String body = this.restTemplate.getForObject("/", String.class);
		// then
		assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
	}
}
