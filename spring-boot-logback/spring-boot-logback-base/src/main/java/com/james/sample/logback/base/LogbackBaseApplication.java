package com.james.sample.logback.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogbackBaseApplication {



    public static void main(String[] args) {
        SpringApplication.run(LogbackBaseApplication.class, args);
    }

}
