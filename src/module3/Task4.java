package module3;

import module3.animal.Animal;
import module3.animal.Cat;
import module3.animal.Dog;
import module3.animal.Nursery;

public class Task4 {
    public static void main(String[] args) {
        Nursery nursery = new Nursery(10);
        Animal dog1 = new Dog("Jack", 2);
        Animal dog2 = new Dog("Joker", 4);
        Animal dog3 = new Dog("Brother", 4);
        Animal cat1 = new Cat("Masia", 1);
        Animal cat2 = new Cat("Mursik", 0);
        Animal cat3 = new Cat("Mars", 5);
        nursery.addAnimal(cat1);
        nursery.addAnimal(cat2);
        nursery.addAnimal(cat3);
        nursery.addAnimal(dog1);
        nursery.addAnimal(dog2);
        nursery.addAnimal(dog3);

        Animal animal = nursery.getAnimal(Cat.class, 2, 4);
        System.out.println(animal);
    }
}
