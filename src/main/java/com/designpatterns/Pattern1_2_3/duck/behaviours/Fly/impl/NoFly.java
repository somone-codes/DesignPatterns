package com.designpatterns.Pattern1_2_3.duck.behaviours.Fly.impl;

import com.designpatterns.Pattern1_2_3.duck.behaviours.Fly.FlyBehaviour;

public class NoFly implements FlyBehaviour {
    @Override
    public void performFly() {
        System.out.println("I cannot fly.");
    }
}
