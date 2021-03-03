package com.tts.students.service;

import com.tts.students.model.StudentV1;
import com.tts.students.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class Runner{



    @Bean
    CommandLineRunner run( StudentRepository studentRepository) throws Exception {
      return args -> {
          StudentV1 student1 = new StudentV1("Maria", "Jones", "mjones@gmail.com", LocalDate.of(1986, Month.MARCH, 25));
          StudentV1 student2 = new StudentV1("Marlon", "Wayans", "mWayans@gmail.com", LocalDate.of(1990, Month.APRIL, 3));
          StudentV1 student3 = new StudentV1("Martin", "Lawrence", "mmartin@gmail.com", LocalDate.of(2000, Month.AUGUST, 24));
      studentRepository.saveAll(List.of(student1, student2, student3));
      };

    }




}

