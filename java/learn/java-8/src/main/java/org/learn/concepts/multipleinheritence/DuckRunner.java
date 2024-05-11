package org.learn.concepts.multipleinheritence;

import org.learn.concepts.multipleinheritence.models.implementations.RubberDuck;
import org.learn.concepts.multipleinheritence.models.interfaces.Duck;

public class DuckRunner {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        System.out.println(duck.getColor());
        duck.makeSound();
    }
}
