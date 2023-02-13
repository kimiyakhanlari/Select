package com.example.demo.web;

import com.example.demo.model.sql.TbStudent;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<TbStudent> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public Long saveStudent() {
        return studentService.save();
    }

    @DeleteMapping("/students")
    public Long delete() {
        return studentService.delete();
    }

    @PutMapping("/students")
    public Long update() {
        return studentService.update();

    }

}
