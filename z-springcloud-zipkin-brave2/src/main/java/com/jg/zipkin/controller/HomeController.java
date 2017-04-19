package com.jg.zipkin.controller;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


@RestController
@RequestMapping("/")
public class HomeController {
    
    @Autowired
    private OkHttpClient client;
 
    private  Random random = new Random();

    @RequestMapping("bar")
    public String bar() throws InterruptedException, IOException {  //service3 method
        Random random = new Random();
        int sleep= random.nextInt(100);
        TimeUnit.MILLISECONDS.sleep(sleep);
        System.out.println("333");
        return " [service3 sleep " + sleep+" ms]";
    }
    
}
