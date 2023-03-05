package com.malarska;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo<T extends Animal> {
    public ArrayList<T> animals;

    public Zoo() {
        animals= new ArrayList<>();
    }
    public void addAnimal(T animal){
        animals.add(animal);
    }
    public void printAllAnimals(){
        Iterator<T> iterator = animals.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
