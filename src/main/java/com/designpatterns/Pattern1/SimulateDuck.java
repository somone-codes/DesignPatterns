package com.designpatterns.Pattern1;


import com.designpatterns.Pattern1.duck.Duck;
import com.designpatterns.Pattern1.duck.impl.MallardDuck;

public class SimulateDuck {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

    }
}
