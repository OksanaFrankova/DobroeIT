package module3.animal;

public abstract class Animal {
    public static int count = 0;
    private String name;
    private int age;

    public Animal(String aName, int anAge) {
       this.name = aName;
       this.age = anAge;
       count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void voice();

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null || this.getClass() != that.getClass()) {
            return false;
        }
        Animal animal = (Animal) that;
        return (this.age == animal.age)
                &&
                (this.name.equals(animal.name));
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + this.getClass().getSimpleName() + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    abstract void dyingVoice();

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        dyingVoice();
    }
}
