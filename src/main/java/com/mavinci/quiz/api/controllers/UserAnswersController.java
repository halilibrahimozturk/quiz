package com.mavinci.quiz.api.controllers;

import com.mavinci.quiz.business.abstracts.IUserAnswerService;

import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.entities.concretes.UserAnswer;
import com.mavinci.quiz.entities.dtos.UserAnswerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/userAnswers")
public class UserAnswersController {
    @Autowired
    IUserAnswerService userAnswerService;

    public UserAnswersController(IUserAnswerService userAnswerService) {
        this.userAnswerService = userAnswerService;
    }


    @GetMapping("/getAll")
    public DataResult<List<UserAnswer>> getAll() {

        return this.userAnswerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody UserAnswerDTO userAnswerDTO) {


        return this.userAnswerService.add(userAnswerDTO);

    }


    @GetMapping("/getByUserId")
    public DataResult<List<UserAnswer>> getByUserId(@RequestParam long id) {

        return this.userAnswerService.getByUserId(id);
    }


}
