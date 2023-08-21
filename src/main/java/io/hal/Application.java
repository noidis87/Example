package io.hal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("SpringBootApplication is running...");
        SpringApplication.run(Application.class, args);
    }
}



