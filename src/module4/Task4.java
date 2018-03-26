package module4;

import module3.animal.Dog;

public class Task4 {
    public static void main(String[] args) {
        Object object = new Object();
        String name = getClassName(object);
        System.out.println(name);
        System.out.println(getClassName(new Dog("Tui", 3)));
        System.out.println(getClassName("str"));
        System.out.println(getClassName(1));
    }

    private static String getClassName(Object object) {
        Class aClass = object.getClass();
        return aClass.getName();
    }
}
