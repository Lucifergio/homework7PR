package ru.gb.homework7.service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.homework7.model.Student;
import ru.gb.homework7.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StudentService {

    private final StudentRepository studentRepository;

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student edit(Student product) {
        return studentRepository.edit(product);
    }

    public Student findById(Integer id) {
        return studentRepository.findById(id).orElse(new Student());
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void deleteById(Integer id) {
        studentRepository.deleteById(id);
    }
}