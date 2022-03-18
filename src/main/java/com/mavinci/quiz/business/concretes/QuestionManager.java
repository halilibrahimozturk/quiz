package com.mavinci.quiz.business.concretes;

import com.mavinci.quiz.business.abstracts.IQuestionService;
import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.core.utilities.results.SuccessDataResult;
import com.mavinci.quiz.core.utilities.results.SuccessResult;
import com.mavinci.quiz.dataAccess.abstracts.IQuestionDao;
import com.mavinci.quiz.entities.concretes.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class QuestionManager implements IQuestionService {

    private final IQuestionDao questionDao;

    @Override
    public DataResult<List<Question>> getAll() {
        return new SuccessDataResult<List<Question>>(this.questionDao.findAll(),"Questions viewed");
    }

    @Override
    public Result add(Question question) {
        this.questionDao.save(question);
        return new SuccessResult("New question added");
    }

    @Override
    public DataResult<Question> getById(long id) {
        return new SuccessDataResult<Question> (this.questionDao.getById(id),"Question viewed");
    }

    @Override
    public DataResult<List<Question>> getByLevel(String level) {
        return new SuccessDataResult<List<Question>> (this.questionDao.getByLevel(level),"Questions viewed");
    }

    @Override
    public DataResult<List<Question>> getByCategory(String category) {
        return new SuccessDataResult<List<Question>> (this.questionDao.getByCategory(category),"Questions viewed");
    }

    @Override
    public DataResult<List<Question>> getByLevelAndCategory(String level, String category) {

        return new SuccessDataResult<List<Question>> (this.questionDao.getByLevelAndCategory(level, category),"Questions viewed");
    }

//    @Override
//    public DataResult<List<Question>> getByLevelAndCategory(String level, String category) {
//        List<Question> levelAndCategoryEntity = questionDao.getByLevelAndCategory(level, category);
//        //dtoya cevir
//
//        return new SuccessDataResult<List<Question>> (,"Questions viewed");
//    }

}
