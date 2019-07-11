package com.ishan.SpringBootMicroservicesPhotoAppUserService.services;

import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.dtos.UserDTO;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.entities.UserEntity;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.request.UserRequest;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.response.UserResponse;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private ModelMapper mapper = null;

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init() {
        mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    @Override
    public UserDTO mapUserRequestToUserDTO(UserRequest userRequest) {
        UserDTO userDTO = mapper.map(userRequest, UserDTO.class);
        userDTO.setEncryptedPassword(bCryptPasswordEncoder.encode(userRequest.getPassword()));
        return userDTO;
    }

    @Override
    public UserEntity mapUserDTOToUserEntity(UserDTO userDTO) {
        UserEntity userEntity = mapper.map(userDTO, UserEntity.class);
        return userEntity;
    }

    @Override
    public UserDTO mapUserEntityToUserDTO(UserEntity userEntity) {
        UserDTO userDTO = mapper.map(userEntity, UserDTO.class);
        return userDTO;
    }

    @Override
    public UserResponse mapUserDTOToUserResponse(UserDTO userDTO) {
        UserResponse userResponse = mapper.map(userDTO, UserResponse.class);
        return userResponse;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        userDTO.setUserId(UUID.randomUUID().toString());
        UserEntity userEntity = mapUserDTOToUserEntity(userDTO);
        userEntity = userRepository.save(userEntity);
        return mapUserEntityToUserDTO(userEntity);
    }
}