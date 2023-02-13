package com.example.demo.service;

import com.example.demo.model.sql.TbStudent;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @Transactional
    public List<TbStudent> getAllStudents() {
        var students = studentRepository.findAll();
        students.forEach(tbStudent -> System.out.println(tbStudent.getFirstname()));
        return students;
    }

    @Transactional
    public Long save() {
        return studentRepository.insert();
    }

    @Transactional
    public Long delete() {
        return studentRepository.delete();
    }
    @Transactional
    public Long update()
    {
        return studentRepository.update();
    }

}
