package by.pavel.votingapp.repository;

import by.pavel.votingapp.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VoterRepository extends JpaRepository<Voter, Long> {
}
