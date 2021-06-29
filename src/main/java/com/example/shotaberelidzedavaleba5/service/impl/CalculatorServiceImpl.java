package com.example.shotaberelidzedavaleba5.service.impl;

import com.example.shotaberelidzedavaleba5.aspect.Println;
import com.example.shotaberelidzedavaleba5.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Println
    @Override
    public int multiplication(int x, int y) {
        try {
            return x * y;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
}