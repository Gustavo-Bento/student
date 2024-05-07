package com.fatec.student.resources;

import org.springframework.web.bind.annotation.RestController;
import com.fatec.student.entities.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setId(1);
        s1.setName("Gustavo Ferreira");
        s1.setCourse("Engenharia da Computação");

        s2.setId(2);
        s2.setName("Gabriel da Silva");
        s2.setCourse("Análise e Desenvolvimento de Sistemas");

        s3.setId(1);
        s3.setName("Ricardo Toiobo");
        s3.setCourse("Gestão de Tecnologia da Informação");

        ArrayList<Student> lista = new ArrayList<Student>();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        return lista;

    }
}
