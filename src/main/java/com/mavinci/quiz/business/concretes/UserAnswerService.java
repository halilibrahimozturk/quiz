package com.mavinci.quiz.business.concretes;

import com.mavinci.quiz.business.abstracts.IUserAnswerService;
import com.mavinci.quiz.core.utilities.results.DataResult;
import com.mavinci.quiz.core.utilities.results.Result;
import com.mavinci.quiz.core.utilities.results.SuccessDataResult;
import com.mavinci.quiz.core.utilities.results.SuccessResult;
import com.mavinci.quiz.dataAccess.abstracts.UserAnswerRepository;
import com.mavinci.quiz.entities.concretes.Question;
import com.mavinci.quiz.entities.concretes.UserAnswer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserAnswerService implements IUserAnswerService {

    private final UserAnswerRepository userAnswerRepository;


    @Override
    public DataResult<List<UserAnswer>> getAll() {
        return new SuccessDataResult<List<UserAnswer>>(this.userAnswerRepository.findAll(),"User answers viewed");
    }

    @Override
    public Result add(UserAnswer userAnswer) {
        this.userAnswerRepository.save(userAnswer);
        return new SuccessResult("New user answer added");    }

    @Override
    public DataResult<List<UserAnswer>> getByUserId(long id) {
        return new SuccessDataResult<List<UserAnswer>> (this.userAnswerRepository.getByUserId(id),"User answers viewed");
    }
}
