package com.pdev.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class HeavyService {

    @Async
    public void doWorkAsynchronously() {
        try {
            System.out.println("Start Async Method");
            int a = 5;
            int b = 10;
            int suma = a + b;
            Thread.sleep(5000L);
            System.out.println("Suma: " + suma);
            Thread.sleep(5000L);
            System.out.println("Sleep");
            Thread.sleep(50000L);
            System.out.println("End Async Method");
        }
        catch (Exception ex) {
            System.out.println("Error! " + ex.getMessage());
        }
    }

}
