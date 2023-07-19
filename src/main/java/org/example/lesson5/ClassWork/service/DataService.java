package org.example.lesson5.ClassWork.service;

import org.example.lesson5.ClassWork.model.Type;
import org.example.lesson5.ClassWork.model.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String patron, Type type);
    List<User> read();
    List<User> read(Type type);
}
