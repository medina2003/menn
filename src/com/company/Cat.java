package com.company;

public class Cat extends Animal{
    private String thisCat = "кот любит играть с лазером";

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        peculiarity = " у " + getName() + "серые  ноги";
        System.out.println("Зовут кота " + getName() + "\n возраст кота " + getAge() + " лет" + peculiarity +
                "\n" + thisCat + "\n" + "-----------------------------------------------------------------");

    }
}
