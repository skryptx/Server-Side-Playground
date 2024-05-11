package org.learn.concepts.multipleinheritence.models.interfaces;

import org.learn.concepts.multipleinheritence.models.enums.Colors;

public interface Duck {
    void makeSound();
    default Colors getColor() {
        return Colors.Black;
    }
}
