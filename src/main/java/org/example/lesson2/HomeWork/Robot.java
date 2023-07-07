package org.example.lesson2.HomeWork;

public class Robot implements Sportsman {
    private int id;
    private String name;
    private int maxLength;
    private int maxHeight;
    public boolean active;
    private static int count = 0;

    public Robot(String name, int maxLength, int maxHeight) {
        count++;
        this.id = Integer.parseInt("333" + Integer.toString(count));
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.active = true;
    }

    @Override
    public void run(RunningTrack rt) {
        if (this.active == true) {
            String type = this.getClass().toString().substring(this.getClass().toString().lastIndexOf(".") + 1, this.getClass().toString().length());
            if (rt.getLength() <= this.maxLength) {
                System.out.println("Sportsman number " + id + " " + type + " " + name + " runs " + rt.getLength() + " m.");
            }
            else {
                this.active = false;
                System.out.println("Sportsman number " + id + " " + type + " " + name + " dropped off.");
            }
        }
    }

    @Override
    public void jump(Wall wall) {
        if (this.active == true) {
            String type = this.getClass().toString().substring(this.getClass().toString().lastIndexOf(".") + 1, this.getClass().toString().length());
            if (wall.getHeight() <= this.maxHeight) {
                System.out.println("Sportsman number " + id + " " + type + " " + name + " jumps " + wall.getHeight() + " m.");
            }
            else {
                this.active = false;
                System.out.println("Sportsman number " + id + " " + type + " " + name + " dropped off.");
            }
        }
    }
    @Override
    public String toString() {
        return "Robot {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxLength=" + maxLength +
                ", maxHeight=" + maxHeight +
                ", active=" + active +
                '}';
    }
}
