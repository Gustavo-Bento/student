package com.fatec.student.mappers;

import com.fatec.student.dto.StudentRequest;
import com.fatec.student.dto.StudentResponse;
import com.fatec.student.entities.Student;

public class StudentMapper {

    public static Student toEntity(StudentRequest request){
        Student student = new Student();
        student.setName(request.name());
        student.setCourse(request.course());
        return student;
    }

    public static StudentResponse toDTO(Student student){
        return new StudentResponse(
            student.getId(),
            student.getName(),
            student.getCourse()
        );
    }
}