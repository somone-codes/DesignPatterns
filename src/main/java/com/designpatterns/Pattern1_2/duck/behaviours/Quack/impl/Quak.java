package com.designpatterns.Pattern1_2.duck.behaviours.Quack.impl;

import com.designpatterns.Pattern1_2.duck.behaviours.Quack.QuackBehavior;

public class Quak implements QuackBehavior {
    @Override
    public void performQuack() {
        System.out.println("Quack! Quack!");
    }
}
