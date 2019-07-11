package com.ishan.SpringBootMicroservicesPhotoAppUserService.repository;

import com.ishan.SpringBootMicroservicesPhotoAppUserService.models.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
