package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Animal[] arrayAnimal ={createObject("Dog"),createObject("Frog"),createObject("Cat")};
        for (Animal f:arrayAnimal) {
            f.print();

        }

    }

    public static Animal createObject(String className){
        switch (className){
            case "Dog":
                Dog dog = new Dog("Bobik",7);
                return dog;
            case "Frog":
                Parrot Parrot = new Parrot("Grisha",2);
                return Parrot;
            case "Cat":
                Cat cat = new Cat("Tom",4);
                return cat;
        }
        return null;

    }
}
