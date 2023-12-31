package App;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chris
 */
public class Person {
    private String name;
    private int age;

    // Constructors, getters, and setters

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
        @Override
    public String toString() {
        return this.getClass().getSimpleName() + ":" +
                "name='" + getName() + '\'' +
                ", age=" + getAge();
    }
}