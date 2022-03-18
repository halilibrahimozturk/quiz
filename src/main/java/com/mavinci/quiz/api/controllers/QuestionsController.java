package com.mavinci.quiz.api.controllers;

import com.mavinci.quiz.business.abstracts.IQuestionService;
import com.mavinci.quiz.core.concretes.MapService;
import com.mavinci.quiz.core.mappers.IQuestionDtoMapper;
import com.mavinci.quiz.core.mappers.QuestionDtoMapperImpl;
import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.entities.concretes.Question;
import com.mavinci.quiz.entities.dtos.QuestionDto;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.lang.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/questions")
public class QuestionsController {

    private final IQuestionService questionService;

    private final MapService mapService;

    private IQuestionDtoMapper questionDtoMapper
            = Mappers.getMapper(IQuestionDtoMapper.class);

//    private IQuestionDtoMapper questionDtoMapper
//            = Mappers.getMapper(IQuestionDtoMapper.class);



//    @GetMapping("/getAll")
//
//    public DataResult<List<Question>> getAll(){
//
//        return this.questionService.getAll();
//    }
//
//    @PostMapping("/add")
//    public Result add(@RequestBody Question question){
//        return this.questionService.add(question);
//
//    }
//
//    @GetMapping("/getById")
//    public DataResult<Question> getById(@RequestParam  long id){
//
//        return this.questionService.getById(id);
//    }
//
//    @GetMapping("/getByLevel")
//    public DataResult<List<Question>> getByLevel(@RequestParam  String level){
//
//        return this.questionService.getByLevel(level);
//    }
//
//    @GetMapping("/getByCategory")
//    public DataResult<List<Question>> getByCategory(@RequestParam  String category){
//
//        return this.questionService.getByCategory(category);
//    }
//
//    @GetMapping("/getByLevelAndCategory")
//    public DataResult<List<Question>> getByLevelAndCategory(@RequestParam  String level , String category){
//
//        return this.questionService.getByLevelAndCategory(level, category);
//    }




    @GetMapping("/map")
    @ResponseBody
    public List<QuestionDto> getQuestions() {
        List <QuestionDto> questions = mapService.getAllQuestions();

        return questions;
    }




    @GetMapping("/getByLevelAndCategory")
    public DataResult<List<Question>> getByLevelAndCategory(@RequestParam  String level , String category){


        Question question = new Question();
        question.setQuestion("SourceName");
        question.setOptionA("SourceDescription");
        QuestionDto questionDto = questionDtoMapper.questionToDto(question);


        return this.questionService.getByLevelAndCategory(level, category);






    }







}
