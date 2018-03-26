package module4;

import module3.animal.Animal;
import module3.animal.Cat;
import module3.animal.Dog;
import module3.animal.Fish;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Task5 {
    public static void main(String[] args) {
        Animal fish1 = new Fish("Bable", 2);
        Animal fish2 = new Fish("BableBee", 1);
        Animal fish3 = new Fish("BableBuu", 2);
        Animal dog1 = new Dog("Jack", 2);
        Animal cat1 = new Cat("Masia", 5);
        Animal[] animals = {dog1, fish1, fish2, fish3, cat1};
        int count = 0;
        for (Animal animal: animals) {
            try {
                animal.voice();
            } catch (NotImplementedException ex) {
                count++;
            }
        }
        System.out.println("NotImplementedException count=" + count);
    }
}
