package com.designpatterns.Pattern1_2.duck.impl;

import com.designpatterns.Pattern1_2.duck.Duck;
import com.designpatterns.Pattern1_2.duck.behaviours.Fly.impl.NoFly;
import com.designpatterns.Pattern1_2.duck.behaviours.Quack.impl.Squeak;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am a Redhead duck");
    }

    public RubberDuck() {
        setQuackBehavior(new Squeak());
        setFlyBehaviour(new NoFly());
    }

}