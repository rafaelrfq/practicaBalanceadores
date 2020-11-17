package edu.pucmm.eict.balanceadores.services;

import edu.pucmm.eict.balanceadores.entities.GradedPoll;
import edu.pucmm.eict.balanceadores.repositories.GradedPollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class GradedPollServices {
    @Autowired
    private GradedPollRepository gradedPollRepository;

    public GradedPoll createGradedPoll(GradedPoll poll){
        return gradedPollRepository.save(poll);
    }

    public GradedPoll findGradedPollById(long id){
        return gradedPollRepository.findById(id);
    }

    public List<GradedPoll> findAllGradedPolls() {
        return gradedPollRepository.findAll();
    }

    public List<GradedPoll> findGradedPollsByDate(LocalDate date){
        return gradedPollRepository.findByDateCreated(date);
    }
}
