package com.tts.students.repository;

import com.tts.students.model.StudentV1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository  extends CrudRepository<StudentV1, Long> {


   //@Query("select email from STUDENTS WHERE email=?")
    Optional<StudentV1> findByEmail(String email);
}
