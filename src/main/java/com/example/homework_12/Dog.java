package com.example.homework_12;

public class Dog implements Animal{
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "name='" + name + ", color='" + color ;
    }

    @Override
    public void animalPlus() {
        System.out.println("ит уйду кайтарат");

    }

    @Override
    public void animalMinus() {
        System.out.println("ит катуу тиштейт");

    }


}
