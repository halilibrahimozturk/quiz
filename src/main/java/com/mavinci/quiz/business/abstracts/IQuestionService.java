package com.mavinci.quiz.business.abstracts;

import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.entities.concretes.Question;

import java.util.List;

public interface IQuestionService {

    DataResult<List<Question>> getAll();
    Result add(Question question);

    DataResult <Question> getById(long id);
    DataResult<List<Question>> getByLevel(String level);
    DataResult<List<Question>> getByCategory(String category);
    DataResult<List<Question>> getByLevelAndCategory(String level,String Category);

}
