package com.example.jwtadvance.jwtadvance.repository;

import com.example.jwtadvance.jwtadvance.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
