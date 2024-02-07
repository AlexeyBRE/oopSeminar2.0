package org.example;

public class People extends IsLive{
    public People(String name) {
        super(name);
    }

    @Override
    void jump() {
        System.out.println("Человек по имени :" + getName() + " прыгнул");
    }

    @Override
    void run() {
        System.out.println("Человек по имени :" + getName() + " пробежал");
    }
}
