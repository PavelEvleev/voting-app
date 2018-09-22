package by.pavel.votingapp.repository;

import by.pavel.votingapp.model.ThemeVote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pavel on 22.09.18.
 */
public interface ThemeVoteRepository extends JpaRepository<ThemeVote, Long> {

    ThemeVote getByUuid(String uuid);

}
