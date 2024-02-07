package org.example;

public class Cat extends IsLive{
    public Cat(String name) {
        super(name);
    }

    @Override
    void jump() {
        System.out.println("Кот по имени : " + getName() + " прыгнул");
    }

    @Override
    void run() {
        System.out.println("Кот по имени : " + getName() + " пробежал");
    }
}
