package com.freshield.inheritance;

/**
 * Created by FRESHIELD on 2016/6/9.
 */
public class AnimalFactory {
    public Animal createAnimal(String name){
        String classPath = "com.freshield.inheritance." + name;
        try {
            Class<Animal> animalClass = (Class<Animal>) Class.forName(classPath);
            Animal animal = animalClass.newInstance();
            return animal;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
