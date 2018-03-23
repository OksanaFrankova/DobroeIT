package module3.animal;

import module3.animal.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }
}
