package com;

public class Main {
    public static void main(String[] args) {

    }
}

interface Shape {
    void draw();
}

class Elka implements Shape {
    @Override
    public void draw() {

    }
}


interface Animal {
    public static enum E{}
public static interface MyInnerInterface {
        int i = 5;
        void eat();}
    public static class MyInnerClass { }
    int i = 5;
    void eat();
}

interface Cat extends Animal {
    void move();
}

class Tiger implements Animal, Cat {
    @Override
    public void eat() {
    }

    @Override
    public void move() {
    }
}