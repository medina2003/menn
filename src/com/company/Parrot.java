package com.company;

public class Parrot extends Animal{
    private String thisFrog = " попугай белый";
    public Parrot(String name, int age) {
        super(name, age);

    }
    @Override
    public void print() {
        peculiarity = " у " + getName() + " рост 30 см";
        System.out.println("Зовут попугая " + getName() + "\n возраст попугая " + getAge() + " лет" + "\n" + peculiarity +
                "\n" + thisFrog + "\n----------------------------------------------------");
    }
    }
