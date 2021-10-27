package com.reto3.cliclotres_reto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
//@EntityScan(basePackages =("com.reto3.ciclotres_reto3.modelo"))
public class CliclotresReto3Application {

    public static void main(String[] args) {

        SpringApplication.run(CliclotresReto3Application.class, args);
    }

}
