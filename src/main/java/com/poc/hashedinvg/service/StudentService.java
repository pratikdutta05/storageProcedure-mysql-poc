package com.poc.hashedinvg.service;

import com.poc.hashedinvg.entity.Student;
import com.poc.hashedinvg.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.getStudents();
    }

    @Transactional
    public Student getStudentById(Integer id) {
        return studentRepository.getStudentById(id);
    }
}
