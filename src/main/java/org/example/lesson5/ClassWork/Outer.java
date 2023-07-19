package org.example.lesson5.ClassWork;

public class Outer {
    public Outer() {
    }

//    class Inner { // внутренний класс
//        public int innerValue;
//
//        public Inner(int innerValue) {
//            this.innerValue = innerValue;
//        }
//
//        public void innerMethod() {
//            System.out.println("outerValue = " + outerValue);
//            System.out.println("innerValue = " + innerValue);
////            innerMethod();
//            outerMethod();
//        }
//    }

    static class Inner { // вложенный класс, все равно что вытащить наружу из этого класса
        public int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
//            System.out.println("outerValue = " + outerValue);
            System.out.println("innerValue = " + innerValue);
//            innerMethod();
//            outerMethod();
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println("outerValue = " + outerValue);
//        System.out.println("innerValue = " + innerValue);
//        innerMethod();
//        outerMethod();

    }

    public static void main(String[] args) {
        // Inner inner = new Outer().new Inner(10);
        Inner inner = new Inner(10);
        class Point { // локальный класс
            int x;

            public Point(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        '}';
            }
        }

        Point point = new Point(3);
        System.out.println("point.toString() = " + point.toString());

        Flyable flyable = new Flyable() { // анонимный класс
            @Override
            public void fly() {
                System.out.println("We are flying.");
            }
        };

        flyable.fly();
    }
}
