package module4;

import module3.animal.Animal;
import module3.animal.Cat;
import module3.animal.Dog;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Jack", 2);
        Animal cat1 = new Cat("Masia", 5);
        Animal[] animal = {dog1, cat1};
        System.out.println(dog1.toString());
        System.out.println(cat1);
        System.out.println(Arrays.toString(animal));
    }
}
