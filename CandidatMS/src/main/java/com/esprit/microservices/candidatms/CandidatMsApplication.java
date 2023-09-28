package com.esprit.microservices.candidatms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CandidatMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CandidatMsApplication.class, args);
    }

}
