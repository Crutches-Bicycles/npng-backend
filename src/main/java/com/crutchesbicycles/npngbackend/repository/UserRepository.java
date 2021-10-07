package com.crutchesbicycles.npngbackend.repository;

import com.crutchesbicycles.npngbackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> getAll();

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);
}
