package com.company;

public class Dog {
    private int age;
    private String color;
    private String favToy;

    public Dog(int age, String color, String favToy) {
        this.age = age;
        this.color = color;
        this.favToy = favToy;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(2,"brown", "octopus");
        Dog dog2 = new Dog(2, "brown", "octopus");

        if (dog1 == dog2) {
            System.out.println("Those two dogs are equal.");
        }
        if (dog1.equals(dog2)) {
            System.out.println("Those two dogs are (deep) equal.");
        }
        if (dog1 == dog1) {
            System.out.println("Dog1 shallow equals itself.");
        }
        if (dog1.equals(dog1)) {
            System.out.println("Dog1 deep equals itself.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFavToy() {
        return favToy;
    }

    public void setFavToy(String favToy) {
        this.favToy = favToy;
    }
}
