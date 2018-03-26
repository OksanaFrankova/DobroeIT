package module4;

import module3.animal.Animal;
import module3.animal.Cat;
import module3.animal.Dog;

public class Task1 {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Jack", 2);
        Animal dog2 = new Dog("Jack", 2);
        Animal dog3 = new Dog("Brother", 4);
        Animal cat1 = new Cat("Masia", 5);
        Animal cat2 = new Cat("Mursik", 0);
        Animal cat3 = new Cat("Masia", 5);

        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.equals(dog3));
        System.out.println(dog1.equals(cat1));
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));

    }
}
