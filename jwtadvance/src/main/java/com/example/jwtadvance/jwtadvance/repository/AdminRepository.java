package com.example.jwtadvance.jwtadvance.repository;

import com.example.jwtadvance.jwtadvance.Entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {

}
