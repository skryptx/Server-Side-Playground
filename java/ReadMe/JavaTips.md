### Tips:

1. `java.lang` is imported by default, due to which we are directly able to use classes like `String`, `Integer` etc.
2. When you implement `equals` methods, you should also implement hashcode `method`. Two equal objects should have same `hashcode` value.
3. **Access Modifiers:**
   
   **i.** Public class is accessible in another package.\
   **ii.** default class(this is default access specifier) is  not accessible in other package, it can only be accessed in same package and sub packages.\ 
   **iii.** Methods:\
   -> **public** can be accessed everywhere.\
   -> **protected** can be accessed withing package and class that inherits its class.\
   -> **default** can be access anywhere within the same package.\
   -> **private** can be accessed only within the class.\
4. **Non Access Modifiers:**\
   -> **final classes:** It cannot be extended.(e.g. String, Int**eger etc.)\
   -> **final methods:** It cannot override final method. When you dont want to change the functionality of parent method.\
   -> **final variable:** does not want value to change.\
   -> **final arguments:** same cannot want value to change.\
   The following implementation is allowed. We are only doing assignment once.
   ```java
        final int i;
        i=6;
        System.out.println(i);
   ```
5. Cannot access non static methods or variables from static method. But opposite is possible. Cannot use `this` something in static method.