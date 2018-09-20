package by.pavel.votingapp.repository;

import by.pavel.votingapp.data.Voting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pavel on 20.09.18.
 */
public interface VotingRepository extends JpaRepository<Voting,Long>{
}
