package com.mavinci.quiz.entities.dtos;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
public class UserAnswerDTO {

    private long id;
    private String userAnswer;

    private String questionId;

    private String userId;
}
