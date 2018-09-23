package by.pavel.votingapp.repository;

import by.pavel.votingapp.model.ThemeVote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ThemeVoteRepository extends JpaRepository<ThemeVote, Long> {

    ThemeVote getByUuid(String uuid);

    @Query("select th.title  from ThemeVote th where th.id=:voteId")
    String getTitleByThemeVote_Id(@Param("voteId") Long voteId);

    List<ThemeVote> getThemeVoteByActiveTrue();

}
