### Encapsulation

1. The class variables should not be updated directly from outside of the class.
2. Only class methods should update the variables.
3. Make class variable private.

Note: Default value of int is 0

### Abstraction

1. We dont need to know the inner details of a class.
e.g. Lets say we have a class `Car`, User wants to start `Car` by just calling `start()` function, we do not want to know what start is doing or what else start is calling inorder to start the car.
2. Details of functionlity is abstracted away from the consumer.

### Important Points

1. If no constructor provided, then java will provide 0 argument default constructor.
2. As soon as we declare a constructor, java wont provide default constructor by itself.

### Explicit Type Casting

When casting is done from type of more bytes to type of lesser bytes(e.g. long to int), you have to explicitly cast it. e.g.

`long l = 102109832190339203`<br>
`int i = (int) l; value will not be the same if it exceeds the limit`

### Implicit Type Casting

When casting is done from type of less bytes to type of more bytes(e.g. int to long), just assignment is enough. e.g.

`int i = 10210983`<br>
`long l = i; //value will be the same`

### Reference Types 
1. Memory is of two types => Stack and Heap.
2. <b> Each reference type variable is stored in a heap(and reference address is stored in stack with variable name) and primitive type variable is stored in stack directly. </b>
3. Each method has its own stack

#### <u>Inbuilt Reference Classes</u>

<b>1. String</b>\
a) stringVar.subtring(5,13) // 5 is inclusive , 13 exclusive.\
b) 

### Important Notes

1. When you want accurate result , do not use float or doube. Use BigDecimal in that scenario. <br>
`BigDecimal big1 = new BigDecimal("2.3324324");`<br>
`BigDecimal big2 = new BigDecimal("2.2343242");`<br>
`BigDecimal big3 = big1.add(big2);`

2. Parameter is necessary to be in string other wise it will not be accurate.
3. Add two different types, result will be bigger type.
4. if(i) is not allowed, assuming i is of any other type other than boolean.