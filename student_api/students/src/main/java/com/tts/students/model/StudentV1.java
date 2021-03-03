package com.tts.students.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;


@Entity(name = "studentsV1")
@Data
@Table
@AllArgsConstructor
@Builder
public class StudentV1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ApiModelProperty(notes = "Student First Name")
    private String firstName;
    @ApiModelProperty(notes = "Student Last Name")
    private String lastName;
    @ApiModelProperty(notes = "Student Email")
    private String email;
    @ApiModelProperty(notes = "Student DOB")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dob;



    public StudentV1(String firstName, String lastName, String email, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
    }
    public StudentV1(){

    }
}
