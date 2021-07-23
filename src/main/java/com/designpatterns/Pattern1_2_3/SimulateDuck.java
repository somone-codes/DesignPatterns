package com.designpatterns.Pattern1_2_3;


import com.designpatterns.Pattern1_2_3.duck.Duck;
import com.designpatterns.Pattern1_2_3.duck.impl.MallardDuck;

public class SimulateDuck {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

    }
}
