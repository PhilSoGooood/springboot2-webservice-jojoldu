package com.example.springboot.web.dto;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloResponseDtoTest {

	@Test
	@DisplayName("롬복 기능 테스트")
	void lombok_test() {
		// given
		String name = "test";
		int amount = 1000;
		// when
		HelloResponseDto dto = new HelloResponseDto(name, amount);
		// then
		assertThat(dto.getName()).isEqualTo(name);
		assertThat(dto.getAmount()).isEqualTo(amount);
	}

}
