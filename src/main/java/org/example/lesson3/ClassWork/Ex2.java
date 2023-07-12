package org.example.lesson3.ClassWork;

public class Ex2 {
    public static void main(String[] args) {
        Fruit fr = Fruit.APPLE;
        switch (fr){
            case APPLE -> System.out.println("Apple "+ fr.getCalory());
            case ORANGE -> System.out.println("Orange "+ fr.getCalory());
            case MANGO -> System.out.println("Mango "+ fr.getCalory());
            default -> System.out.println("Not a fruit.");
        }

    }
}
