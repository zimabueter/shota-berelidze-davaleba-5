package com.example.shotaberelidzedavaleba5;

import com.example.shotaberelidzedavaleba5.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplicationTest() {
        int expected = 70;
        int actual;
        actual = calculatorService.multiplication(4, 1);
        assertEquals(expected, actual);
    }
}