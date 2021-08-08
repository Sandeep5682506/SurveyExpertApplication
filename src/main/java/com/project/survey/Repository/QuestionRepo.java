package com.project.survey.Repository;

//import com.project.survey.survey.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.survey.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Long> {
}
