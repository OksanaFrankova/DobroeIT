package module3.animal;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        throw new NotImplementedException();
    }

    @Override
    void dyingVoice() {

    }
}
