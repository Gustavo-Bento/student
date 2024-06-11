package com.fatec.student.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationErrors extends StandardError{
    private List<String> errors = new ArrayList<>();
    
    public void addError(String errors){
        this.errors.add(errors);
    }
    public List<String> getErrors(){
        return this.errors;
    }
}
