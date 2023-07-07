package org.example.lesson1.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        //Cat cat1 = new Cat();
        Cat cat1 = new Cat("barsik", "color", 21);
        cat1.setAge(-5);
        cat1.setAge(10);
        cat1.animalInfo();
        cat1.voice();
        cat1.jump();

//        Animal cat2 = new Cat("marik", "color", 21);
//        ((Cat) cat2).round();
        Animal[] catAndDog = {
                new Cat("barsik", "color", 21),
                new Dog("marik", "color", 16)
        };

        for (Animal o : catAndDog) {
            o.voice();
//            try {
//                ((Cat) o).round();
//            }catch (ClassCastException ex){
//                System.out.println("Error!");
//            }
//            if (o instanceof Cat)
                o.round();
//            else
//                System.out.println("This is not cat");
        }

    }
}
