package com.project.survey.Controller;

//import com.project.survey.survey.model.Question;
//import com.project.survey.survey.model.QuestionOption;
//import com.project.survey.survey.service.QuestionOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.survey.Model.QuestionOption;
import com.project.survey.Service.QuestionOptionService;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionOptionController {

    private final QuestionOptionService questionOptionService;

    @Autowired
    public QuestionOptionController(QuestionOptionService questionOptionService) {
        this.questionOptionService = questionOptionService;
    }

    @PostMapping("/addOptions")
    public ResponseEntity<QuestionOption> addOption(@RequestBody QuestionOption questionOption){
        QuestionOption newOption = questionOptionService.addOption(questionOption);
        return new ResponseEntity<>(newOption, HttpStatus.CREATED);
    }

    @GetMapping("/allOptions")
    public ResponseEntity<List<QuestionOption>> getAllOptions(){
        List<QuestionOption> options = questionOptionService.getAllOptions();
        return new ResponseEntity<>(options, HttpStatus.OK);
    }




}
