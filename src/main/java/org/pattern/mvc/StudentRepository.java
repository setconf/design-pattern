package org.pattern.mvc;

/*
 * Fake student repository
 * */
public class StudentRepository {

    public Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
