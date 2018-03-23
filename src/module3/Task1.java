package module3;

import module3.animal.Animal;
import module3.animal.Cat;
import module3.animal.Dog;

public class Task1 {
    public static void main(String[] args) {
        Animal dog = new Dog("Jack", 2);
        System.out.println("Name:" + dog.getName() + " Age:" + dog.getAge());
        dog.voice();
        Animal cat = new Cat("Masia", 1);
        System.out.println("Name:" + cat.getName() + " Age:" + cat.getAge());
        cat.voice();

        System.out.println("Animal count:" + Animal.count);


    }
}
