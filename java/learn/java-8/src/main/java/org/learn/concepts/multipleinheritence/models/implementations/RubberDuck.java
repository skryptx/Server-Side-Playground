package org.learn.concepts.multipleinheritence.models.implementations;

import org.learn.concepts.multipleinheritence.models.interfaces.Duck;

public class RubberDuck implements Duck {

    @Override
    public void makeSound() {
        System.out.println("Rubber Duck Squeaks!");
    }
}
