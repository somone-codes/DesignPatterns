package com.designpatterns.Pattern1_2.duck.impl;

import com.designpatterns.Pattern1_2.duck.Duck;
import com.designpatterns.Pattern1_2.duck.behaviours.Fly.impl.FlyingWithWings;
import com.designpatterns.Pattern1_2.duck.behaviours.Quack.impl.Quak;

public class RedheadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a Redhead duck");
    }

    public RedheadDuck() {
        setQuackBehavior(new Quak());
        setFlyBehaviour(new FlyingWithWings());
    }
}
