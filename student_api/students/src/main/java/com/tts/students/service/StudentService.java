package com.tts.students.service;

import com.tts.students.model.StudentV1;

import java.util.List;
import java.util.Optional;


public interface StudentService {
    Optional<StudentV1> getStudent(Long id);
    Iterable<StudentV1> getAllStudents();
    void addStudent(StudentV1 student);
    List<StudentV1> getStudents();
    void deleteById(Long id);
//    Student getStudent(String email);


}
