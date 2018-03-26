package module3.animal;


public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    void dyingVoice() {
        System.out.println("Meeeeoooo...");
    }
}
