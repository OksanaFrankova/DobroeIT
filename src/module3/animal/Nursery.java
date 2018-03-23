package module3.animal;

public class Nursery {
    private final int numberOfRooms;
    private final Animal[] animals;
    private int freeRoomIndex = 0;

    public Nursery(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        this.animals = new Animal[numberOfRooms];
    }

    public boolean addAnimal(Animal animal) {
        if (numberOfRooms - freeRoomIndex > 0) {
            animals[freeRoomIndex] = animal;
            freeRoomIndex++;
            return true;
        }
        return false;
    }

    public Animal getAnimal(Class animalClass, int fromAge, int toAge) {
        for (int i = 0; i < freeRoomIndex; i++) {
            Animal animal = animals[i];

            if (animal.getClass() == animalClass &&
                    animal.getAge() >= fromAge && animal.getAge() <= toAge) {

                return animal;
            }
        }
        return null;
    }
}
