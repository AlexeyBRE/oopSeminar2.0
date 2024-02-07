package org.example;

public abstract class Work {
    private String name;

    public Work(String name) {
        this.name = name;
    }

    abstract void jump();
    abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                '}';
    }
}
