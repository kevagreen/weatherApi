package com.tts.students.controller;

import com.tts.students.model.StudentV1;
import com.tts.students.model.StudentV2;
import com.tts.students.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("api/v2")
@RestController
@Api(value = "Student Information", description = "Operations pertaining to Students")
public class StudentControllerV2 {


    StudentService studentService;

    @Autowired
    public StudentControllerV2(StudentService studentService){
        this.studentService = studentService;
    }


    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successfully retrieved student using the student's id"),
            @ApiResponse(code = 401, message = "You are not authorized to view the student information")
    })
    @ApiOperation(value = "Get all menu items", response = StudentV2.class, responseContainer = "Optional")
    @GetMapping("/{id}")
    public Optional<StudentV1> getStudentById(@PathVariable Long id){
      return studentService.getStudent(id);
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successfully retrieved all students"),
            @ApiResponse(code = 401, message = "You are not authorized to view the list of students")
    })
    @ApiOperation(value = "Get all menu items", response = StudentV2.class, responseContainer = "List")
    @GetMapping("/all")
    public Iterable<StudentV1> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/new/student")
    public void createNewStudent(@RequestBody StudentV1 student){
        studentService.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteById(id);
    }

//    @PatchMapping("/student/{id}")
//    public Optional<Student> updateStudent(@RequestParam Long id, @RequestParam(required = false) String email){
//       Student student;
//       student.g
//
//    }
//
//    private void setStudentEmail(Long id, String email){
//        Student student = s
//    }


}
