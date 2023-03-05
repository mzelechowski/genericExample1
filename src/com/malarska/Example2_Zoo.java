package com.malarska;

public class Example2_Zoo {
    public static void main(String[] args) {
        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(new Tiger("Tygrys1", 22));
        //animals.addAnimal(new Animal("None", 0));  - bo klasa abstarykcja
        zoo.addAnimal(new Lion("Lion", 66));
        zoo.addAnimal(new Lion("Pasiasty", 35));
        zoo.printAllAnimals();
    }
}
