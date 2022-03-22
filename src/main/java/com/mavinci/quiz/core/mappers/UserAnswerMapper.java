package com.mavinci.quiz.core.mappers;

import com.mavinci.quiz.entities.concretes.Question;
import com.mavinci.quiz.entities.concretes.UserAnswer;
import com.mavinci.quiz.entities.dtos.QuestionDTO;
import com.mavinci.quiz.entities.dtos.UserAnswerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserAnswerMapper extends EntityMapper<UserAnswerDTO, UserAnswer>  {

}
