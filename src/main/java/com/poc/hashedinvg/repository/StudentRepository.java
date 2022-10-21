package com.poc.hashedinvg.repository;

import com.poc.hashedinvg.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Procedure("get_student")
    List<Student> getStudents();

    @Procedure("get_student_by_id")

    Student getStudentById(Integer id_in);
}
