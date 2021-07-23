package com.designpatterns.Pattern1_2;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a Rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}