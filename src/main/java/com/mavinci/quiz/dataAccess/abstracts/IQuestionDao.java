package com.mavinci.quiz.dataAccess.abstracts;

import com.mavinci.quiz.entities.concretes.Question;
import com.mavinci.quiz.entities.dtos.QuestionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IQuestionDao extends JpaRepository<Question,Integer> {


    Question getById(long id);

    List<Question> getByLevel(String level);

    List<Question> getByCategory(String category);

    List<Question> getByLevelAndCategory(String level , String category);



}


