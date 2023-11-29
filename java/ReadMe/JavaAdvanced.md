### Functional Programming

#### 1. <u>Lambda Expression</u>
Simple example:
```java
List<String> names = List.of("Sinni", "Singla");
names.stream().forEach(
    name -> System.out.println(name)
);
```

##### 1.1.1 Filter example:
```java
List<String> names = List.of("Sinni", "Singla");
names.stream()
    .filter(name -> name.endsWith("ni"))
    .forEach(
        name -> System.out.println(name)
    );
```

##### 1.1.2 Reduce example:
```java
List<Integer> nums = List.of(1,2,3,4,5);
int sum = nums.stream()
    .reduce(0, (num1, num2) => num1 + num2);
```
**first param** -> accumulator with starting value\
**second param** -> callback function

##### 1.1.3 Other operations:

-> Intermediate Operations(Which return another stream):
```java
List<Integer> nums = List.of(1,12,3,54,5,3);
nums.stream()
    .sorted()
    .forEach(
        name -> System.out.println(name)
    );

nums.stream()
    .distinct()
    .forEach(
        name -> System.out.println(name)
    );    

nums.stream()
    .map(num -> num*2);
```

-> Terminal Operations:\
Do not return a stream. You cannot use another operation on the terminal operation's output. e.g. reduce, forEach, max (accepts comparator) etc