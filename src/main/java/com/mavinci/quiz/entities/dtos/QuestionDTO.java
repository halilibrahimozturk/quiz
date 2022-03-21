package com.mavinci.quiz.entities.dtos;

import lombok.Data;

import javax.persistence.Column;


@Data
public class QuestionDTO {
    private long id;

    private String question;

    private String optionA;

    private String optionB;

    private String optionC;

    private String optionD;

    private String optionE;


}
