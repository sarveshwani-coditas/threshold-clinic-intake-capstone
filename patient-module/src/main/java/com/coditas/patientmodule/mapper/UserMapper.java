package com.coditas.patientmodule.mapper;

import com.coditas.utilitymodule.dto.UserRequest;
import com.coditas.utilitymodule.dto.UserResponse;
import com.coditas.utilitymodule.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequest request);

    UserResponse toDTO(User user);
}
