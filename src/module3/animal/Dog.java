package module3.animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Gav");
    }

    @Override
    void dyingVoice() {
        System.out.println("Gauuu...");
    }
}
