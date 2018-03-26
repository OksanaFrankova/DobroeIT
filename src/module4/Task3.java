package module4;

import module3.animal.Cat;
import module3.animal.Dog;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("start");
        for (int i = 0; i < 1_000_000; i++){
            new Dog("Jack", 2);
            new Cat("Masia", 5);
        }
        System.out.println("end");

    }
}
