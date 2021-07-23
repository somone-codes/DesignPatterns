package com.designpatterns.Pattern1_2;

public class MallardDuck extends Duck implements IFly{
    @Override
    public void display() {
        System.out.println("I am a Mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("I can flyyyyy");
    }
}
