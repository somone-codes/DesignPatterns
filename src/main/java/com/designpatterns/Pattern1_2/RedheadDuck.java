package com.designpatterns.Pattern1_2;

public class RedheadDuck extends Duck implements IFly{
    @Override
    public void display() {
        System.out.println("I am a Redhead duck");
    }

    @Override
    public void fly() {
        System.out.println("I can flyyyyy");
    }
}
