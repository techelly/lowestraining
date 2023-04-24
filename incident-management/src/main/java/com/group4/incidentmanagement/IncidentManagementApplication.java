package com.group4.incidentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.group4.incidentmanagement"})
public class IncidentManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncidentManagementApplication.class, args);
    }

}
