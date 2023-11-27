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
   ```java
   interface Machines {
    default void printName() {
            System.out.println("Sinni");
        }
   }
   ```
2. Use **implements** keyword to inherit it inside class.
3. You have to overrride all the declared methods.
4. All child class objects can be assigned to this interface type variables.\
   ```java
   IMachine computer = new Computer();
   IMachine iPad = new IPad();
   ```

### Important Points

1. If no constructor provided, then java will provide 0 argument default constructor.
2. As soon as we declare a constructor, java wont provide default constructor by itself.

### Explicit Type Casting

When casting is done from type of more bytes to type of lesser bytes(e.g. long to int), you have to explicitly cast it. e.g.
```java
long l = 102109832190339203
int i = (int) l; value will not be the same if it exceeds the limit
```
### Implicit Type Casting

When casting is done from type of less bytes to type of more bytes(e.g. int to long), just assignment is enough. e.g.
```java
int i = 10210983
long l = i; //value will be the same
```
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
```java
Integer seven = 7;
Integer sevenAgain = 7
seven == sevenAgain // true
```
Definition: <b>Autoboxing</b> is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called <b>Unboxing</b>.

1. Here internally 7 is changed to Integer.valueOf(7), which searches for any heap variable already containg 7 and then assigns the reference to left hand side variable.
2. AutoBoxing is syntactic sugar. 

### Arrays
Declaration: `int[] array = {1,2,3}`

## Collections

### List:
1. `List<String> words = List.of("Apple", "Bat", "Cat")` // creates a immutable list. We cannot perform add , remove operation on it.
   
#### 1. ArrayList
2. In order to create mutable list, use one of the below implementation.\
   ```java
   List<String> arrayList = new ArrayList<String>(words);
   List<String> vectorList = new Vector<String>(words);
   List<String> linkedList = new LinkedList<String>(words);
   ```
3. `list[1]` is not allowed, use `list.get(1)` instead.
4. `list.set(4, "sinni")` will set index 4 with "sinni".
5. Conversion from array to mutable list below:\
   ```java
   int[] numbers = new int[]{1,2,4,5,6,7};
   List<String> numberImmutableList 
            = numbers.asList(numbers);\\makes an immutable list
   List<String> numberArrayList 
            = new ArrayList<>(numberImmutableList); \\mutable list
   ```
   

#### 2. Vector:
1. Used to keep your program threadsafe. e.g if you have 10 threads running , only one thread will be executing at a time.
2. Rarely used in non thread scenarios. Bad performance due to that.

### ***Iterator***:
1. We cannot remove element from list when we are looping list using for loop.
2. In this case it is better to use iterator.\
```java
List<String> names = new ArrayList<>(List.of("bat","cat","gorilla"));
Iterator<String> iterator = names.iterator();
while(iterator.hasNext()) {
   if(iterator.next().contains("at")) {
      iterator.remove();
   }
}
```

#### 3. LinkedList:
1. It is doubly linked list.

### Set
1. Stores unique value.
```java
Set unmutableSet = Set.of("Apple", "Banana", "Orange");
```

#### 1. HashSet (Mutable):
1. It is mutable.
2. If you insert already present item it will return **false**.
3. We cannot add or remove element by index as it does not maintains the order, so no method by index exist.
```java
Set<String> hashSet = new HashSet<>(unmutableSet);
hashSet.Add("Banana"); //will return false and order will change
```
4. **Hashing:**\
   a. Each cell of array is used to store references to LinkedList for easy searches.\
   b. The index of array(inturn linkedlist) at which element needs to be inserted is decided my **hash function**.\
   c. Hash Function can be as simple as **mod n**. (**n** can be any number)

#### 2. LinkedSet:
a. Maintains the insertion order. It means the duplicate element encountered does not change the order of the original element present in set.

#### 3. TreeSet:
a. Inserts in sorted order. It does not care about insertion order.

### Queue:
1. LIFO.

#### 1. Priority Queue:
1. Sorted order.
2. We can define the comparator on how to compare two elements for sorting.
   ```java
   Queue<String> pq = new PriorityQueue<>(List.of("Cat"));
   pq.addAll(List.of("Dog", "Bat", "Sleep")); // Queue will be ["Bat", "Cat", "Dog", "Sleep"]
   pq.poll(); // will pop dequeue the element => "Bat"
   pq.offer("zebra"); // enqueue the element
   ```


### Map
1. Key-Value pairs.
   ```java 
   Map<String, Integer> map = Map.of("A",2,"B",3);
   map.put("C",3);// not allowed as above method created immutable map
   map.get("B"); // 3
   map.get("D"); // null
   map.containsKey("B"); // true
   map.containsValue(3); // true
   map.isEmpty();
   map.keySet(); // returns collection of keys
   map.values();// returns collection of values
   ```

#### 1. HashMap:
a. More efficient , because it neither cares about insertion order nor about sorting order.
   ```java
   Map<String, Integer> map = new HashMap(Map.of("A",2,"B",3)); // mutable
   ```

#### 2. LinkedHashMap:
a. Maintains the insertion order
   ```java
   Map<String, Integer> map = new LinkedHashMap(Map.of("A",2,"B",3)); // mutable
   ```

#### 3. TreeMap:
a. Maintains the sorted order
   ```java
   Map<String, Integer> map = new TreeMap(Map.of("A",2,"B",3)); // mutable
   ```

## Important Notes

1. When you want accurate result , do not use float or doube. Use BigDecimal in that scenario.
```java
BigDecimal big1 = new BigDecimal("2.3324324");
BigDecimal big2 = new BigDecimal("2.2343242");
BigDecimal big3 = big1.add(big2);
```
1. Parameter is necessary to be in string other wise it will not be accurate.
2. Add two different types, result will be bigger type.
3. if(i) is not allowed, assuming i is of any other type other than boolean.