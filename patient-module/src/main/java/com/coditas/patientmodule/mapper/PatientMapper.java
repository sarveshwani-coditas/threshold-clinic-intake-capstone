package com.coditas.patientmodule.mapper;

import com.coditas.patientmodule.dto.PatientRequest;
import com.coditas.patientmodule.dto.PatientResponse;
import com.coditas.patientmodule.entity.Patient;
import com.coditas.utilitymodule.mapper.UserMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface PatientMapper {
    Patient toEntity(PatientRequest request);

    PatientResponse toDTO(Patient savedPatient);
}
