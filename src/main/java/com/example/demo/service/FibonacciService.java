package com.example.demo.service;

import java.util.List;

import com.example.demo.controller.RespuestaFibonacciDTO;

public interface FibonacciService {
    RespuestaFibonacciDTO entregarSerie();

    List<Integer> devolverSerie (int semilla1, int semilla2, int iteraciones);

}
