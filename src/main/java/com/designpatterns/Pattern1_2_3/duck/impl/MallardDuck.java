package com.designpatterns.Pattern1_2_3.duck.impl;

import com.designpatterns.Pattern1_2_3.duck.Duck;
import com.designpatterns.Pattern1_2_3.duck.behaviours.Fly.impl.FlyingWithWings;
import com.designpatterns.Pattern1_2_3.duck.behaviours.Quack.impl.Quak;

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
