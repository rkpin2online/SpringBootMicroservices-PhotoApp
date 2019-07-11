package com.ishan.SpringBootMicroservicesPhotoAppUserService.controllers;

import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.dtos.UserDTO;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.request.UserRequest;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.response.UserResponse;
import com.ishan.SpringBootMicroservicesPhotoAppUserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getUsers() {
        return "Getting all users...";
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
                 produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserRequest userRequest) {
        UserDTO userDTO = userService.mapUserRequestToUserDTO(userRequest);
        UserDTO createdUserDTO = userService.createUser(userDTO);
        return new ResponseEntity<>(userService.mapUserDTOToUserResponse(createdUserDTO), HttpStatus.CREATED);
    }
}