package com.designpatterns.Pattern1_2.duck.behaviours.Fly.impl;

import com.designpatterns.Pattern1_2.duck.behaviours.Fly.FlyBehaviour;

public class FlyingWithWings implements FlyBehaviour {

    @Override
    public void performFly() {
        System.out.println("I am Flying");
    }
}
