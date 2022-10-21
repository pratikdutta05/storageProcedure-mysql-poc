package com.poc.hashedinvg.controller;

import com.poc.hashedinvg.entity.Student;
import com.poc.hashedinvg.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@Slf4j
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/allStudent")
    @Transactional
    public List<Student> getAllStudent(){
        log.info("Request for All Student");
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getAllStudent(@PathVariable Integer id){
        log.info("Request for Student with id {}",id);
        return studentService.getStudentById(id);
    }
}
