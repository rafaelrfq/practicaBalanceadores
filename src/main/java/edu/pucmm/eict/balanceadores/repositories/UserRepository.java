package edu.pucmm.eict.balanceadores.repositories;

import edu.pucmm.eict.balanceadores.entities.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    List<User> findAllByUsernameNotNull();
    User findByUsernameAndPassword(String username, String password);
}