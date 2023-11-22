## OOP Concepts
### Encapsulation

1. The class variables should not be updated directly from outside of the class.
2. Only class methods should update the variables.
3. Make class variable private.

Note: Default value of int is 0

### Abstraction

1. We dont need to know the inner details of a class.
e.g. Lets say we have a class `Car`, User wants to start `Car` by just calling `start()` function, we do not want to know what start is doing or what else start is calling inorder to start the car.
2. Details of functionlity is abstracted away from the consumer.

### Inheritence
1. Inherits by using extends <b>keyword</b>.
2. Java implicitly calls <b>super</b> to initialize parent class variables by calling its constructors.
3. Cannot extend two classes(multiple inheritence).

### Method Overriding
1. **@Override** annotation is not required although preferred for readability and to avoid any error.

### Abstract Class
1. Abstract class is used when we dont want to define the methods.
2. If we declared one method as abstract , we have to declare class as abstract as well.
3. We cannot create instance of abstract class.
4. It is **must to override methods** if you inherit abstract class.

### Interfaces
1. Only declare methods although we can give default implementation of the method using **default** keyword.\
   `interface Machines {`\
    `default void printName() {`\
        `    System.out.println("Sinni");`\
        `}`\
   `}`
2. Use **implements** keyword to inherit it inside class.
3. You have to overrride all the declared methods.
4. All child class objects can be assigned to this interface type variables.\
   `IMachine computer = new Computer();`\
   `IMachine iPad = new IPad();` 

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
b) stringVar.charAt(5) // returns character at index 5
c) Better option than String(immutable) is "StringBuffer"(in case of multithreading) and "StringBuilder"(incase of single threaded programs). 

### AutoBoxing and UnBoxing

`Integer seven = 7;`\
`Integer sevenAgain = 7`\
`seven == sevenAgain` // true

Definition: <b>Autoboxing</b> is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called <b>Unboxing</b>.

1. Here internally 7 is changed to Integer.valueOf(7), which searches for any heap variable already containg 7 and then assigns the reference to left hand side variable.
2. AutoBoxing is syntactic sugar. 

### Arrays
Declaration: `int[] array = {1,2,3}`

## Collections

### List:
1. `List<String> words = List.of("Apple", "Bat", "Cat")` // creates a immutable list. We cannot perform add , remove operation on it.
2. In order to create mutable list, use one of the below implementation.\
   `List<String> arrayList = new ArrayList<String>(words);`\
   `List<String> vectorList = new Vector<String>(words);`\
   `List<String> linkedList = new LinkedList<String>(words);`

### Vector:
1. Used to keep your program threadsafe. e.g if you have 10 threads running , only one thread will be executing at a time.
2. Rarely used in non thread scenarios. Bad performance due to that.

## Important Notes

1. When you want accurate result , do not use float or doube. Use BigDecimal in that scenario. <br>
`BigDecimal big1 = new BigDecimal("2.3324324");`<br>
`BigDecimal big2 = new BigDecimal("2.2343242");`<br>
`BigDecimal big3 = big1.add(big2);`

2. Parameter is necessary to be in string other wise it will not be accurate.
3. Add two different types, result will be bigger type.
4. if(i) is not allowed, assuming i is of any other type other than boolean.