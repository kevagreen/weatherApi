package com.tts.students.service;

import com.tts.students.model.StudentV1;
import com.tts.students.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{


 StudentRepository studentRepository;

 public StudentServiceImpl(StudentRepository studentRepository){
     this.studentRepository = studentRepository;
 }

    @Override
    public List<StudentV1> getStudents(){
     return (List<StudentV1>) studentRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        boolean exist = studentRepository.existsById(id);
        if (!exist){
            throw new IllegalStateException("student with id " + id + "not found");
        }
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<StudentV1> getStudent(Long id){
     return  studentRepository.findById(id);
    }

    @Override
    public Iterable<StudentV1> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(StudentV1 student){
   Optional<StudentV1> studentOptional = studentRepository.findByEmail(student.getEmail());

   if (studentOptional.isPresent()){
       throw  new IllegalStateException("email taken");
   }
   studentRepository.save(student);
    }

//    @Override
//    public Student getStudent(String email){
//     Student student ;
//     student.getStudent(String email);
//    }
}
