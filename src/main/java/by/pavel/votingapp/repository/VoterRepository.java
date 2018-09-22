package by.pavel.votingapp.repository;

import by.pavel.votingapp.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pavel on 20.09.18.
 */
public interface VoterRepository extends JpaRepository<Voter,Long>{
}
