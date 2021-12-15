package org.pattern.mvc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate application's concerns.
 *
 * Model - Model represents an object or JAVA POJO carrying data.
 * It can also have logic to update controller if its data changes.
 *
 * View - View represents the visualization of the data that model contains.
 *
 * Controller - Controller acts on both model and view. It controls the data flow into model object
 * and updates the view whenever data changes. It keeps view and model separate.
 *
 * @see <a href="https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm">MVC pattern</a>
 * */
class MVCTest {

    @Test
    void MVCPatternTest() {
        String john = "John";
        StudentRepository repository = new StudentRepository();
        Student model = repository.retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        assertEquals(StudentDTO.builder()
                        .rollNo(model.getRollNo())
                        .name(model.getName())
                        .build(),
                view.getStudentDTO());

        controller.setStudentName(john);
        controller.updateView();
        assertEquals(StudentDTO.builder()
                        .rollNo(model.getRollNo())
                        .name(john)
                        .build(),
                view.getStudentDTO());
    }
}
