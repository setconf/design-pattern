package org.pattern.mvc;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/*
 * StudentView is a view class which can print student details on console
 * */
@Slf4j
@Getter
public class StudentView {
    private StudentDTO studentDTO;

    public void printStudentDetails(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
        log.info("Student: ");
        log.info("Name: {}", studentDTO.getName());
        log.info("Roll No: {}", studentDTO.getRollNo());
    }
}
