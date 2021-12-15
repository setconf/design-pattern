package org.pattern.mvc;

import lombok.AllArgsConstructor;

/*
 * StudentController is the controller class responsible to store data in Student object
 * and update view StudentView accordingly.
 * */
@AllArgsConstructor
public class StudentController {
    private Student model;
    private StudentView view;

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public void updateView() {
        StudentDTO studentDTO = StudentDTO.builder()
                .rollNo(model.getRollNo())
                .name(model.getName())
                .build();
        view.printStudentDetails(studentDTO);
    }
}
