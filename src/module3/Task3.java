package module3;

import module3.animal.Animal;
import module3.animal.Cat;
import module3.animal.Dog;

public class Task3 {
    private static final char[] VOWELS = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};

    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        Animal dog1 = new Dog("Jack", 2);
        Animal dog2 = new Dog("Joker", 4);
        Animal dog3 = new Dog("Brother", 4);
        Animal cat1 = new Cat("Masia", 1);
        Animal cat2 = new Cat("Mursik", 0);
        Animal cat3 = new Cat("Mars", 10);
        animals[0] = dog1;
        animals[1] = cat1;
        animals[2] = dog2;
        animals[3] = dog3;
        animals[4] = cat3;
        animals[5] = cat2;

        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            if (animal instanceof Cat && isAgeMatch(animal.getAge())) {
                animals[i] = null;
                System.out.println(animal);
            }
            else if (animal instanceof Dog && isNameMatch(animal.getName())) {
                animals[i] = null;
                System.out.println(animal);
            }
        }
    }

    private static boolean isNameMatch(String name) {
        char[] chars = name.toCharArray();
        int consonantsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char symbol = chars[i];
            char lowerCase = Character.toLowerCase(symbol);
            if (!isVowel(lowerCase)) {
                consonantsCount++;
            }
        }

        return consonantsCount > 4;
    }

    private static boolean isVowel(char lowerCase) {
        for (int i = 0; i < VOWELS.length; i++) {
            char vowel = VOWELS[i];
            if (vowel == lowerCase) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAgeMatch(int age) {
        return age < 1 || age > 8;
    }
}
