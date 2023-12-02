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

### MultiThreading:
Advantage: We are keeping CPU busy even when it was supposed to be waiting if using linear approach.

#### 1. Two Ways to do it

##### 1.1 Extend Class Thread
##### 1.2 Implements Runnable Interface

```java
package Concurrency;

import java.util.stream.IntStream;

//Way 1
class Task101to200 extends Thread {
    public void run() {
        for(int num: IntStream.range(101,201).toArray()) {
            System.out.printf("%d ",num);
        }
    }
}

//Way 2
class Task201to300 implements Runnable {
    public void run() {
        for(int num: IntStream.range(201,301).toArray()) {
            System.out.printf("%d ",num);
        }
    }
}
public class ThreadClassRunner {
    public static void main(String[] args) {
        //task1
        Task101to200 task101to200 = new Task101to200();
        task101to200.start();

        //task2
        Task201to300 task201to300 = new Task201to300();
        Thread thread201 to300 = new Thread(task201to300);
        thread201to300.start();
    }
}
```

#### 2. States
**-> NEW:** Thread is created but has not started(before start call)\
**-> Runnable:** When first thread is running, and second thread is in runnable state\
**-> Running:** When thread is executing.\
**-> Waiting/Blocked:** When thread is waiting for external operation to complete, e.g. db operation, api response. \
**-> Terminated/Dead:** When execution is finished.

#### 3. Dependency of threads:
-> Use join method, which means control will wait for the particular thread to terminate before control goes further.\
-> task101to200 will complete in example below before task201to300 begins.  
```java
public class ThreadClassRunner {
    public static void main(String[] args) {
        //task1
        Task101to200 task101to200 = new Task101to200();
        task101to200.start();
        task101to200.join();
        //task2
        Task201to300 task201to300 = new Task201to300();
        Thread thread201to300 = new Thread(task201to300);
        thread201to300.start();
    }
}
```

#### 4. Synchronized Methods:
```java
public synchronized boolean containsKey(Object key) {
    return key instance of Car;
}
```
**->** Only one thread will be able to execute synchronized method at a time, second thread can start execution only if first thread has finished executing the method.\
**->** It ensures thread safety./

#### 5. Executor Service:(TODO)
#### 6. Callable:(TODO)

### Exception Handling:
```java
try {
    String str = "";
    int length = str.length();
    return;
} catch (Exception ex) {
} finally {
    System.out.println("Finally will be executed");
}
```
**->** Finally will be executed even if there is a return statement in the try block.

#### 1. Checked and Unchecked Exception:

**->** **Checked exceptions** are checked at compile time.\
**->** **Unchecked exceptions** occurs at run time. e.g. divide by zero, index out of bounds, null pointer exception etc. These are used by programming errors.