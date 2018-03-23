package module3;

import module3.animal.Animal;
import module3.animal.Cat;
import module3.animal.Dog;

public class Task2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Animal dog1 = new Dog("Jack", 2);
        Animal dog2 = new Dog("Joker", 4);
        Animal cat1 = new Cat("Masia", 1);
        animals[0] = dog1;
        animals[1] = cat1;
        animals[2] = dog2;

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            printAnimal(animal);
        }
    }

    private static void printAnimal(Animal animal) {
        String animalKind = animal.getClass().getSimpleName();
        System.out.println("Animal kind:" + animalKind + " name:" + animal.getName() + " age:" + animal.getAge());
    }
}
