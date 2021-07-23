package com.designpatterns.Pattern1_2.duck;

import com.designpatterns.Pattern1_2.duck.behaviours.Fly.FlyBehaviour;
import com.designpatterns.Pattern1_2.duck.behaviours.Quack.QuackBehavior;

public abstract class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehaviour.performFly();
    }

    public void performQuack(){
        quackBehavior.performQuack();
    }

    public void swim(){
        System.out.println(" I swim!");
    }

    public void display(){
        System.out.println("I am a duck.");
    }

}
