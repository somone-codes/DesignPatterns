package com.designpatterns.Pattern1.duck.impl;

import com.designpatterns.Pattern1.duck.Duck;
import com.designpatterns.Pattern1.duck.behaviours.Fly.impl.FlyingWithWings;
import com.designpatterns.Pattern1.duck.behaviours.Quack.impl.Quak;

public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a Mallard duck");
    }

    public MallardDuck() {
        setQuackBehavior(new Quak());
        setFlyBehaviour(new FlyingWithWings());
    }
}
