package com.company;

public class Dog extends Animal{
    private String thisDog = " эта собака любит сасиску";
    public Dog(String name, int age) {
        super(name, age);

    }
    @Override
    public void print() {
        peculiarity = " у " + getName() + "  глаза карие";
        System.out.println( "Зовут собаку " + getName() + "\n возраст собаки " + getAge() + " лет" + "\n" + peculiarity +
                "\n" + thisDog + "\n-------------------------------------------------------------");
    }
}
