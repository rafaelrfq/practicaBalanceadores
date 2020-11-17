package edu.pucmm.eict.balanceadores.repositories;

import edu.pucmm.eict.balanceadores.entities.GradedPoll;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface GradedPollRepository extends JpaRepository<GradedPoll, Long> {
    GradedPoll findById(long id);
    List<GradedPoll> findByDateCreated(LocalDate date);
    List<GradedPoll> findAll();
}
