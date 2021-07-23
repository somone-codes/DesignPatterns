package com.designpatterns.singleton;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a Mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("I can flyyyyy");
    }
}
