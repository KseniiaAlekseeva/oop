package org.example.lesson2.HomeWork;

public class RunningTrack extends Barrier {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "RunningTrack {" +
                "id=" + id +
                ", length=" + length +
                '}';
    }
}
