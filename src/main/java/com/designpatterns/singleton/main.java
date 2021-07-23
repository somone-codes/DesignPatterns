package com.designpatterns.singleton;

public class main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();

        duck = new RubberDuck();
        duck.fly();
    }
}
