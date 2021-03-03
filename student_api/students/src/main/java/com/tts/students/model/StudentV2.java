package com.tts.students.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "studentsV2")
@Data
@Table
@AllArgsConstructor
@Builder
public class StudentV2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ApiModelProperty(notes = "Student First Name")
    private String firstName;
    @ApiModelProperty(notes = "Student Last Name")
    private String lastName;
    @ApiModelProperty(notes = "Student Email")
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dob;



    public StudentV2(String firstName, String lastName, String email, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
    }
    public StudentV2(){

    }
}
