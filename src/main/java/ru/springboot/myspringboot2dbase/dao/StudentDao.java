package ru.springboot.myspringboot2dbase.dao;

import org.springframework.stereotype.Repository;
import ru.springboot.myspringboot2dbase.entity.Student;

import java.util.List;

@Repository
public interface StudentDao {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
