### Encapsulation

1. The class variables should not be updated directly from outside of the class.
2. Only class methods should update the variables.
3. Make class variable private.

Note: Default value of int is 0

### Abstraction

1. We dont need to know the inner details of a class.
e.g. Lets say we have a class `Car`, User wants to start `Car` by just calling `start()` function, we do not want to know what start is doing or what else start is calling inorder to start the car.
2. Details of functionlity is abstracted away from the consumer.