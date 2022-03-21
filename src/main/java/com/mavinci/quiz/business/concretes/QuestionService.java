package com.mavinci.quiz.business.concretes;

import com.mavinci.quiz.business.abstracts.IQuestionService;
import com.mavinci.quiz.core.mappers.QuestionMapper;
import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.core.utilities.results.SuccessDataResult;
import com.mavinci.quiz.core.utilities.results.SuccessResult;
import com.mavinci.quiz.dataAccess.abstracts.QuestionRepository;
import com.mavinci.quiz.entities.concretes.Question;
import com.mavinci.quiz.entities.dtos.QuestionDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService implements IQuestionService {

    private final QuestionRepository questionRepository;

    private final QuestionMapper questionMapper;



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

    @Override
    public DataResult<List<Question>> getByLevelAndCategory(String level, String category) {

        return new SuccessDataResult<List<Question>> (this.questionRepository.getByLevelAndCategory(level, category),"Questions viewed");
    }

    @Override
    public DataResult<List<QuestionDTO>> getQuestion(String level, String category) {

        List<Question> levelAndCategoryEntity = this.questionRepository.getByLevelAndCategory(level, category);

        List<QuestionDTO> questionDto = questionMapper.toDto(levelAndCategoryEntity);






        return new SuccessDataResult<List<QuestionDTO>> ( questionDto, "Questions viewed");

    }


//    @Override
//    public DataResult<List<Question>> getByLevelAndCategory(String level, String category) {
//        List<Question> levelAndCategoryEntity = questionDao.getByLevelAndCategory(level, category);
//        //dtoya cevir
//
//        return new SuccessDataResult<List<Question>> (,"Questions viewed");
//    }

}
