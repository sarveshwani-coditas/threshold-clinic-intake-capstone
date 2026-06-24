package com.coditas.patientmodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.coditas")
public class PatientModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientModuleApplication.class, args);
    }

}
