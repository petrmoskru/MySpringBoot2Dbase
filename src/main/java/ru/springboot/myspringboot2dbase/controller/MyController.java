package ru.springboot.myspringboot2dbase.controller;

import org.springframework.web.bind.annotation.*;
import ru.springboot.myspringboot2dbase.entity.Student;
import ru.springboot.myspringboot2dbase.model.Result;
import ru.springboot.myspringboot2dbase.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    private final StudentService studentService;

    public MyController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public Result<List<Student>> getAllStudents() {
        return new Result<>(Result.SUCCESS_MESSAGE, studentService.getAllStudents());
    }

    @GetMapping("/students/{id}")
    public Result<Student> getStudent(@PathVariable("id") int id) {
        return new Result<>(Result.SUCCESS_MESSAGE, studentService.getStudent(id));
    }

    @PostMapping("/students")
    public Result<Student> saveStudent(@RequestBody Student student) {
        return new Result<>(Result.SUCCESS_MESSAGE, studentService.saveStudent(student));
    }

    @PutMapping("/students")
    public Result<Student> updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return new Result<>(Result.SUCCESS_MESSAGE, student);
    }

    @DeleteMapping("/students/{id}")
    public Result<Object> deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
        return new Result<>(Result.SUCCESS_MESSAGE, null);
    }

    @ExceptionHandler(Exception.class)
    public Result<String> handleException(Exception e) {
        return new Result<>(Result.ERROR_MESSAGE, e.getMessage());
    }
}
