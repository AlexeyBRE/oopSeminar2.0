package org.example;

public class Gadget extends Work{
    public Gadget(String name) {
        super(name);
    }

    @Override
    void jump() {
        System.out.println("Робот по имени : " + getName() + " прыгнул");
    }

    @Override
    void run() {
        System.out.println("Робот по имени : " + getName() + " пробежал");
    }
}
