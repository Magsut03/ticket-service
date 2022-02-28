package com.example.demo.repasitory.user;

import com.example.demo.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query(value = "select u from users u where u.username = ?1", nativeQuery = true)
    Optional<UserEntity> findByUsername(String username);

}
