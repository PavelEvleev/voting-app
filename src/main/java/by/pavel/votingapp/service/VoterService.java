package by.pavel.votingapp.service;

import by.pavel.votingapp.controller.model.CreateVoterCommand;
import by.pavel.votingapp.model.Voter;
import by.pavel.votingapp.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pavel on 22.09.18.
 */
@Service
public class VoterService {

    private VoterRepository repository;

    @Autowired
    public VoterService(VoterRepository repository) {
        this.repository = repository;
    }

    public Voter createVoter(CreateVoterCommand voter) {
        return this.repository.saveAndFlush(
                new Voter(voter.getFirstName(), voter.getLastName(),
                        voter.getPhoneNumber(), voter.getEmail()));
    }

    public List<Voter> findAll() {
        return this.repository.findAll();
    }

    public Voter getOne(Long id) {
        return this.repository.getOne(id);
    }


}
