package com.coditas.patientmodule.controller;

import com.coditas.patientmodule.dto.PatientRequest;
import com.coditas.patientmodule.dto.PatientResponse;
import com.coditas.patientmodule.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class PatientController {

    private final PatientService patientService;

    @PostMapping
    public void registerPatient(@RequestBody PatientRequest request){
        PatientResponse response = patientService.registerPatient(request);



    }
}
