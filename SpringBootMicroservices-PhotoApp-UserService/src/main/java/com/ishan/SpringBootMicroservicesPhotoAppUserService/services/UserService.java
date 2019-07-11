package com.ishan.SpringBootMicroservicesPhotoAppUserService.services;

import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.dtos.UserDTO;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.entities.UserEntity;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.request.UserRequest;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.response.UserResponse;

public interface UserService {

    UserDTO mapUserRequestToUserDTO(UserRequest userRequest);

    UserEntity mapUserDTOToUserEntity(UserDTO userDTO);

    UserDTO mapUserEntityToUserDTO(UserEntity userEntity);

    UserResponse mapUserDTOToUserResponse(UserDTO userDTO);

    UserDTO createUser(UserDTO userDTO);

}