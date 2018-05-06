package com.students.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Student> student(@PathVariable String id) {
        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()) return ResponseEntity.ok(student.get());
        else return ResponseEntity.notFound().build();

    }
    @GetMapping("/firstName/{firstName}")
    public ResponseEntity<List<Student>> studentByFN(@PathVariable String firstName) {
        Student student = new Student();
        student.setFirstName(firstName);
        Example<Student> studentExample = Example.of(student);
        List<Student> students = studentRepository.findAll(studentExample);

        if(!students.isEmpty()) return ResponseEntity.ok(students);
        else return ResponseEntity.notFound().build();


    }


}
