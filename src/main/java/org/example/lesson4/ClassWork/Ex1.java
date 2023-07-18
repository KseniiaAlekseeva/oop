package org.example.lesson4.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        //Object sum = intBox1.getObj() + intBox2.getObj();
        GenBox<Integer> gen1 = new GenBox(10);
        GenBox<Integer> gen2 = new GenBox(20.0);
        Integer sum=gen1.getObj()+gen2.getObj();
        System.out.println(sum);
    }

}
