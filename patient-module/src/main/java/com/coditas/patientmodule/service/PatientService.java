package com.coditas.patientmodule.service;

import com.coditas.patientmodule.dto.PatientRequest;
import com.coditas.patientmodule.dto.PatientResponse;
import com.coditas.patientmodule.entity.Patient;
import com.coditas.patientmodule.mapper.PatientMapper;
import com.coditas.patientmodule.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;
    private final PatientMapper patientMapper;

    public PatientResponse registerPatient(PatientRequest request) {
        Patient patient = patientMapper.toEntity(request);
        Patient savedPatient = patientRepository.save(patient);
        return patientMapper.toDTO(savedPatient);
    }
}
