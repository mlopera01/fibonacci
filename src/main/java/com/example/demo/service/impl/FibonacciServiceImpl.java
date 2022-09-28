package com.example.demo.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.controller.RespuestaFibonacciDTO;
import com.example.demo.service.FibonacciService;

@Service
public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public RespuestaFibonacciDTO entregarSerie() {
        // TODO Auto-generated method stub
        
        LocalDateTime locaDate = LocalDateTime.now();
        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        //System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds); 
        String hora = hours  + ":"+ minutes +":"+seconds;
        int semilla1 = minutes / 10;
        int semilla2 = minutes % 10;
        List<Integer> serieFibonacci = new ArrayList<>();
        

        //String hora,List<Integer> serieFibonacci
        serieFibonacci = devolverSerie(semilla1, semilla2, seconds);
        RespuestaFibonacciDTO respuestaSerie = new RespuestaFibonacciDTO(hora, serieFibonacci);
        return respuestaSerie;
    }
    

    public List<Integer> devolverSerie (int semilla1, int semilla2, int iteraciones){
        List<Integer> serieFibonacci = new ArrayList<>();
        //así se debe ver la lista al ppio [] y solo permite enteros
        if(iteraciones <0){
            throw new IllegalArgumentException();
        }
        serieFibonacci.add(semilla1);
        serieFibonacci.add(semilla2);
        //[4,3] -> posiciones (4 en posición 0 y 3 en posición 1 - de la lista)
        // seconds es igual a 12
        int temporal = 0;
        int suma = 0;
        while (temporal < iteraciones) {
            //serieFibonacci.add
            suma = serieFibonacci.get(serieFibonacci.size()-1) + serieFibonacci.get(serieFibonacci.size()-2);
            // La primera vez suma = 3+4
            serieFibonacci.add(suma);
            temporal++;
        }
        return serieFibonacci;
    }
}
