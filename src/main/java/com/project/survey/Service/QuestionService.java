package com.project.survey.Service;

//import com.project.survey.survey.model.Question;
//import com.project.survey.survey.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.survey.Model.Question;
import com.project.survey.Repository.QuestionRepo;

import java.util.List;

@Service
public class QuestionService{

    private final QuestionRepo questionRepo;

    @Autowired
    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public Question addQuestion(Question question) {
        return questionRepo.save(question);
    }

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

}
