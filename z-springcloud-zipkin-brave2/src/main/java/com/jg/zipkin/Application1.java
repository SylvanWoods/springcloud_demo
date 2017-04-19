package com.jg.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sun.glass.ui.Application;


@SpringBootApplication
public class Application1 {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application1.class);
        app.run(args);

    }
}
