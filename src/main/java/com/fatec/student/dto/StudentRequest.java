package com.fatec.student.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record StudentRequest(
        @NotNull(message = "Nome não pode ser nulo")
        String name,
        @NotBlank(message = "Curso não pode ser nulo") 
        String course) { 
}
