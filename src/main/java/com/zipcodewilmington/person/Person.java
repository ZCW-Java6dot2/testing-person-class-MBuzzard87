package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private double shoeSize;
    private int weight;
    private boolean isMale;
    private char gender;
    private int heightInch;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.shoeSize = 9.0;
        this.weight = 175;
        this.isMale = true;
        this.gender = 'm';
        this.heightInch = 67;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double shoeSize, int weight, boolean isMale, char gender, int heightInch) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
        this.weight = weight;
        this.isMale = isMale;
        this.gender = gender;
        this.heightInch = heightInch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() { return name; }

    public Integer getAge() {
        return age;
    }

    public double getShoeSize() { return shoeSize; }

    public void setShoeSize(double shoeSize) { this.shoeSize = shoeSize; }

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }

    public boolean isMale() { return isMale; }

    public void setMale(boolean male) { this.isMale = male; }

    public char getGender() { return gender; }

    public void setGender(char gender) { this.gender = gender; }

    public int getHeightInch() { return heightInch; }

    public void setHeightInch(int heightInch) { this.heightInch = heightInch; }
}
