package org.example.lesson5.ClassWork.service;

import org.example.lesson5.ClassWork.model.Student;
import org.example.lesson5.ClassWork.model.Teacher;
import org.example.lesson5.ClassWork.model.Type;
import org.example.lesson5.ClassWork.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService { // backend
    private List<User> userList = new ArrayList<>(); // if no database

    @Override
    public void create(String name, String surname, String patron, Type type) {
        int id = getFreeId(type);
        if (type == Type.STUDENT)
            userList.add(new Student(name, surname, patron, id));
        if (type == Type.TEACHER)
            userList.add(new Teacher(name, surname, patron, id));
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !isStudent)
                lastId++;
            if (user instanceof Student && isStudent)
                lastId++;
        }
        return ++lastId;
    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> read(Type type) {
        List<User> users = new ArrayList<>();
        boolean isStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Student && isStudent)
                users.add(user);
            if (user instanceof Teacher && !isStudent)
                users.add(user);
        }
        return users;
    }
}
