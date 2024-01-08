package com.danztee.quizapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "question")
public class QuestionController {

    @GetMapping(path = "/")
    public String getQuestions() {
        return "these are the questions";
    };
}
