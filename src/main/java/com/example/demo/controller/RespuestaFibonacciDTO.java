package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

public class RespuestaFibonacciDTO {
    private String hora;
    private List<Integer> serieFibonacci;
    
    // acá se crea el constructor
    public  RespuestaFibonacciDTO(String hora,List<Integer> serieFibonacci)
    {
        this.hora = hora;
        this.serieFibonacci = serieFibonacci;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public List<Integer> getSerieFibonacci() {
        return serieFibonacci;
    }

    public void setSerieFibonacci(List<Integer> serieFibonacci) {
        this.serieFibonacci = serieFibonacci;
    }
}
