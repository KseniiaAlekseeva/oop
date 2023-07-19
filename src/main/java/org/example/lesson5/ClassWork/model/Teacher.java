package org.example.lesson5.ClassWork.model;

public class Teacher extends User{
    int teacherId;

    public Teacher(String name, String surname, String patron, int teacherId) {
        super(name, surname, patron);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
