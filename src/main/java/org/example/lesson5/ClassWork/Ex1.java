package org.example.lesson5.ClassWork;

import org.example.lesson5.ClassWork.controller.Controller;

public class Ex1 {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("qwe", "asd", "zxc");
        controller.createStudent("qwe", "asd", "zxc");
        controller.createStudent("qwe", "asd", "zxc");
        controller.getAllStudent();
    }
}
