package com.mavinci.quiz.dataAccess.abstracts;

import com.mavinci.quiz.entities.concretes.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {


    Question getById(long id);

    List<Question> getByLevel(String level);

    List<Question> getByCategory(String category);

    List<Question> getByLevelAndCategory(String level , String category);





}


