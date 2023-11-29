### Functional Programming

#### 1. Lambda Expression
a. Simple example:
```java
List<String> names = List.of("Sinni", "Singla");
names.stream().forEach(
    name -> System.out.println(name)
);
```

b. Filter example:
```java
List<String> names = List.of("Sinni", "Singla");
names.stream()
    .filter(name -> name.endsWith("ni"))
    .forEach(
        name -> System.out.println(name)
    );
```

b. Reduce example:
```java
List<Integer> nums = List.of(1,2,3,4,5);
int sum = nums.stream()
    .reduce(0, (num1, num2) => num1 + num2);
```
**first param** -> accumulator with starting value\
**second param** -> callback function

Other operations:

Intermediate Operations(Which return another stream):
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