package com.mavinci.quiz.business.abstracts;

import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.entities.concretes.UserAnswer;

import java.util.List;

public interface IUserAnswerService {

    DataResult<List<UserAnswer>> getAll();
    Result add(UserAnswer userAnswer);

    DataResult <List<UserAnswer>> getByUserId(long id);


}
