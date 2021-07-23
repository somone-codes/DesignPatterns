package com.designpatterns.singleton;

public abstract class Duck {

    public void quack(){
        System.out.println("Quack Quack!");
    }

    abstract public void display();

    public void fly(){
        System.out.println("Look I am flyyin!");
    }
}
