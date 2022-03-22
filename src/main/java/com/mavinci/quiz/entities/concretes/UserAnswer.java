package com.mavinci.quiz.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Answer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAnswer implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name = "user_answer")
    private String userAnswer;

    @Column(name="question_id")
    private long questionId;

    @Column(name="user_id")
    private long userId;


}