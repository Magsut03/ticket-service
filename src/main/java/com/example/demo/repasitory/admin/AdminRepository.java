package com.example.demo.repasitory.admin;

import com.example.demo.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<UserEntity, Long> {
}
