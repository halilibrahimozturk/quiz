package com.mavinci.quiz.dataAccess.abstracts;

import com.mavinci.quiz.entities.concretes.Question;
import com.mavinci.quiz.entities.concretes.UserAnswer;
import com.mavinci.quiz.entities.dtos.UserAnswerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer,Long>   {


    List<UserAnswer> getByUserId(long id);




}


