package ru.gb.homework7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gb.homework7.model.Student;
import ru.gb.homework7.service.StudentService;

@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("students", new Student());
        return "create-student";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processForm(Student student) {
        if (student.getId() == null) {
            studentService.save(student);
        } else {
            studentService.edit(student);
        }
        return "redirect:/student/all";
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getStudentId(Model model, @PathVariable Integer id) {

        Student student;
        student = studentService.findById(id);
        model.addAttribute("student", student);

        return "student";
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public String getAllStudent(Model model) {

        model.addAttribute("students", studentService.findAll());

        return "student-list";
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public String deleteById(@RequestParam Integer id) {

        studentService.deleteById(id);

        return "redirect:/student/all";
    }

    @RequestMapping(path = "/edit", method = RequestMethod.GET)
    public String editById(Model model, @RequestParam Integer id) {

        model.addAttribute("student", studentService.findById(id));

        return "create-student";
    }
}
