package com.kalkulator.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);
    }

    {

    int a = 10;
    int b = 6;

    Calculator calculator = new Calculator();

    int additionResult = calculator.additionAAndB(a, b);
    int subtractionResult = calculator.subtractionBFromA(a, b);

    System.out.println(additionResult);
    System.out.println(subtractionResult);
    System.out.println("READY!");
}
}
