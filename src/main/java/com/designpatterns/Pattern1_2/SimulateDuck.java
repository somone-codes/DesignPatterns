package com.designpatterns.Pattern1_2;


import com.designpatterns.Pattern1_2.duck.Duck;
import com.designpatterns.Pattern1_2.duck.impl.MallardDuck;

public class SimulateDuck {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

    }
}
