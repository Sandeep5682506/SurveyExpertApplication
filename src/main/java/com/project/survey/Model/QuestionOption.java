package com.project.survey.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class QuestionOption {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int option_id;

    private String option1;
    private String option2;
    private String option3;
    private String option4;

}
