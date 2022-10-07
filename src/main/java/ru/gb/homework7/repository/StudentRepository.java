package ru.gb.homework7.repository;
import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.homework7.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
public class StudentRepository {

    private final SessionFactory sessionFactory;

    @Transactional
    public Student save(Student student) {
        sessionFactory.getCurrentSession().saveOrUpdate(student);
        return student;
    }

    @Transactional
    public Student edit(Student student) {
        sessionFactory.getCurrentSession().update(student);
        return student;
    }

    @Transactional
    public Optional<Student> findById(Integer id) {

        Student student = (Student) sessionFactory.getCurrentSession().getNamedQuery("Student.findById")
                .setParameter("id", id).getSingleResult();
        return Optional.of(student);
    }

    @Transactional
    public List<Student> findAll() {
        return sessionFactory.getCurrentSession().getNamedQuery("Student.findAll").getResultList();
    }

    @Transactional
    public void deleteById(Integer id) {
        sessionFactory.getCurrentSession().getNamedQuery("Student.deleteById").setParameter("id", id);
    }
}