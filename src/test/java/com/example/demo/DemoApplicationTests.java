package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.RespuestaFibonacciDTO;
import com.example.demo.service.FibonacciService;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private FibonacciService fibonaciService;

	@Test
	void testSerieFibonacci_WhenTwoValidValues_thenResultValid() {
		List<Integer> respuesta = fibonaciService.devolverSerie(2, 8, 4);
		assertEquals(10, respuesta.get(2));
	}

	@Test
	void testSerieFibonacci_WhenTwoValidValues_thenResultValid_1() {
		List<Integer> respuesta = fibonaciService.devolverSerie(1, 3, 4);
		assertEquals(18, respuesta.get(5));
	}

	
	@Test
	void testSerieFibonacci_WhenIteracionesPositive_thenSizeValid() {
		List<Integer> respuesta = fibonaciService.devolverSerie(1, 3, 4);
		assertEquals(6, respuesta.size());
	}

	@Test
	void testSerieFibonacci_WhenIteracionesNegative_thenError() {
		assertThrows(IllegalArgumentException.class,
		 () -> fibonaciService.devolverSerie(1, 3, -1));
	}

	@Test
	void testSerieFibonacci_WhenIteracionZero_thenSizeTwo() {
		List<Integer> respuesta = fibonaciService.devolverSerie(1, 3, 0);
		assertEquals(2, respuesta.size());
	}
}
