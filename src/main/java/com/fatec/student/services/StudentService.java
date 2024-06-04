package com.fatec.student.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.student.dto.StudentRequest;
import com.fatec.student.dto.StudentResponse;
import com.fatec.student.entities.Student;
import com.fatec.student.mappers.StudentMapper;
import com.fatec.student.repositories.StudentRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentResponse>getStudents(){
        List<Student> students = studentRepository.findAll();
        return students.stream()
                        .map( s -> StudentMapper.toDTO(s))
                        .collect(Collectors.toList());
                       
    }
    
    public StudentResponse getStudentById(int id){
        Student student = studentRepository.findById(id).orElseThrow(
            ()-> new EntityNotFoundException("Aluno não cadastrado")
        );
        return StudentMapper.toDTO(student);
    }

    public void deleteStudentById(int id){
        if(this.studentRepository.existsById(id)){
            this.studentRepository.deleteById(id);
        }
        else{
            throw new EntityNotFoundException("Aluno não cadastrado");
        }
    }
    public StudentResponse save(StudentRequest request){
        Student student = StudentMapper.toEntity(request);
        return StudentMapper.toDTO(this.studentRepository.save(student));
    }
    public void updateStudentById(int id, StudentRequest student){
        try {
            Student aux = studentRepository.getReferenceById(id);
            aux.setCourse(student.course());
            aux.setName(student.name());
            this.studentRepository.save(aux);

        } catch (Exception e) {
           throw new EntityNotFoundException("Aluno não encontrado");
        }
    }
}
