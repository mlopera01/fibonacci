package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FibonacciService;

@RestController
@RequestMapping( "/fibo" )
public class FibonacciController {
    private final FibonacciService fibonacciService;
    public FibonacciController( @Autowired FibonacciService x)
    {
        this.fibonacciService = x;
    }

    @GetMapping
    public ResponseEntity<RespuestaFibonacciDTO> serieFibonacciCalculada(){
        return ResponseEntity.ok(fibonacciService.entregarSerie());
    }

}
