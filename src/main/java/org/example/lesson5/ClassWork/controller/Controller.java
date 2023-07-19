package org.example.lesson5.ClassWork.controller;

import org.example.lesson5.ClassWork.model.Student;
import org.example.lesson5.ClassWork.model.Type;
import org.example.lesson5.ClassWork.model.User;
import org.example.lesson5.ClassWork.service.UserService;
import org.example.lesson5.ClassWork.view.StudentView;

import java.util.List;

public class Controller { // frontend
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> students = service.read(Type.STUDENT);
        for (User student : students) {
            studentView.printConsole((Student) student);
        }
    }
}
