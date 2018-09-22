package by.pavel.votingapp.repository;

import by.pavel.votingapp.model.ThemeAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by pavel on 22.09.18.
 */
public interface ThemeAnswerRepository extends JpaRepository<ThemeAnswer, Long> {

    List<ThemeAnswer> findThemeAnswerByThemeVote_Id(Long themeVote_id);
}
