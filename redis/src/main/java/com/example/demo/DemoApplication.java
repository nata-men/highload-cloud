package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import redis.clients.jedis.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    private volatile int i = 0;
    Jedis jedis = new Jedis("redis");
    jedis.del("i");
    jedis.set("i","0");

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/count")
    public int count() {
        jedis.incr("i");
    }

    @RequestMapping("/stat")
    public int stat() {
        return jedis.get("i");
    }

}