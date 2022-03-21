package com.mavinci.quiz.api.controllers;

import com.mavinci.quiz.business.abstracts.IQuestionService;
import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.entities.concretes.Question;
import com.mavinci.quiz.entities.dtos.QuestionDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.lang.*;


@RestController
@RequestMapping("/api/questions")
public class QuestionsController {

    private final IQuestionService questionService;

    public QuestionsController(IQuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping("/getAll")
    public DataResult<List<Question>> getAll(){

        return this.questionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Question question){
        return this.questionService.add(question);

    }

    @GetMapping("/getById")
    public DataResult<Question> getById(@RequestParam  long id){

        return this.questionService.getById(id);
    }

    @GetMapping("/getByLevel")
    public DataResult<List<Question>> getByLevel(@RequestParam  String level){

        return this.questionService.getByLevel(level);
    }

    @GetMapping("/getByCategory")
    public DataResult<List<Question>> getByCategory(@RequestParam  String category){

        return this.questionService.getByCategory(category);
    }

    @GetMapping("/getByLevelAndCategory")
    public DataResult<List<Question>> getByLevelAndCategory(@RequestParam  String level , String category){

        return this.questionService.getByLevelAndCategory(level, category);
    }

    @GetMapping("/getQuestion")
    public DataResult<List<QuestionDTO>> getQuestion(@RequestParam  String level , String category){

        return this.questionService.getQuestion(level, category);
    }







//    @GetMapping("/map")
//    @ResponseBody
//    public List<QuestionDTO> getQuestions() {
//        List <QuestionDTO> questions = mapService.getAllQuestions();
//
//        return questions;
//    }










}
