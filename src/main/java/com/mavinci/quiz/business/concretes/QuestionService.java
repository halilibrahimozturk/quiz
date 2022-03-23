package com.mavinci.quiz.business.concretes;

import com.mavinci.quiz.business.abstracts.IQuestionService;
import com.mavinci.quiz.core.mappers.QuestionMapper;
import com.mavinci.quiz.core.mappers.UserAnswerMapper;
import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.core.utilities.results.SuccessDataResult;
import com.mavinci.quiz.core.utilities.results.SuccessResult;
import com.mavinci.quiz.dataAccess.abstracts.QuestionRepository;
import com.mavinci.quiz.dataAccess.abstracts.UserAnswerRepository;
import com.mavinci.quiz.entities.concretes.Question;
import com.mavinci.quiz.entities.concretes.UserAnswer;
import com.mavinci.quiz.entities.dtos.QuestionDTO;
import com.mavinci.quiz.entities.dtos.UserAnswerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionService implements IQuestionService {

    private final QuestionRepository questionRepository;

    private final QuestionMapper questionMapper;

    private final UserAnswerService userAnswerService;

    private  final UserAnswerRepository userAnswerRepository;


    private final UserAnswerMapper userAnswerMapper;

    @Override
    public DataResult<List<Question>> getAll() {
        return new SuccessDataResult<List<Question>>(this.questionRepository.findAll(),"Questions viewed");
    }

    @Override
    public Result add(Question question) {
        this.questionRepository.save(question);
        return new SuccessResult("New question added");
    }

    @Override
    public DataResult<Question> getById(long id) {
        return new SuccessDataResult<Question> (this.questionRepository.getById(id),"Question viewed");
    }

    @Override
    public DataResult<List<Question>> getByLevel(String level) {
        return new SuccessDataResult<List<Question>> (this.questionRepository.getByLevel(level),"Questions viewed");
    }

    @Override
    public DataResult<List<Question>> getByCategory(String category) {
        return new SuccessDataResult<List<Question>> (this.questionRepository.getByCategory(category),"Questions viewed");
    }

//    @Override
//    public DataResult<List<Question>> getByLevelAndCategory(String level, String category) {
//
//        return new SuccessDataResult<List<Question>> (this.questionRepository.getByLevelAndCategory(level, category),"Questions viewed");
//    }

//    @Override
//    public DataResult<List<QuestionDTO>> getQuestions(String level, String category) {
//
//        List<Question> levelAndCategoryEntity = this.questionRepository.getByLevelAndCategory(level, category);
//
//        List<QuestionDTO> questionDto = questionMapper.toDto(levelAndCategoryEntity);
//
//
//
//
//
//
//        return new SuccessDataResult<List<QuestionDTO>> ( questionDto, "Questions viewed");
//
//    }


    @Override
    public DataResult<QuestionDTO> getQuestion(String level, String category) {



        Long id=1L;
        List<UserAnswerDTO> getAnswers=userAnswerService.getByUserId(id);




        QuestionDTO questionDto = questionMapper.toDto(questionRepository.getRandQuestion(level,category,getAnswers.size()>0?getAnswers.stream().map(UserAnswerDTO::getQuestionId).collect(Collectors.toList()): Collections.singletonList(0L)));











        return new SuccessDataResult<QuestionDTO> ( questionDto, "Questions viewed");

    }


}
