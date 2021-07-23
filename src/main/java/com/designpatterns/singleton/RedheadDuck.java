package com.designpatterns.singleton;

public class RedheadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a Redhead duck");
    }

    @Override
    public void fly() {
        System.out.println("I can flyyyyy");
    }
}
