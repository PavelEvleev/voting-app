package by.pavel.votingapp.repository;

import by.pavel.votingapp.model.ThemeAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThemeAnswerRepository extends JpaRepository<ThemeAnswer, Long> {

    List<ThemeAnswer> findThemeAnswerByThemeVote_Id(Long id);
}
