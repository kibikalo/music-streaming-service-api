package com.kibikalo.music.streaming.service.api.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
