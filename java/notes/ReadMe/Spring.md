### Spring Container:
1. Also called IOC container. It manages Spring beans and their lifecycle.
2. **BeanFactory** and **ApplicationContext** represent the IoC Containers. 
3. **ApplicationContext** is the sub interface of BeanFactory. 

### JavaBean vs SpringBean

```java
//madatory to implement Serializable
class JavaBean implements Serializable{
    // should have public no-arg constructor
    // you can declare it, anyway java automatically adds it
    public JavaBean() {}

    private String text;
    private int number;

    //getters and setters are mandatory
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    ...
}
```
1. JavaBean not used much these days.
2. POJO and SpringBean are important to know based on current trend.

```java
@Configuration
public class SpringBean {
    record Person(String name, int age) {}
    @Bean('age1')
    public int age() {
        return 31;
    }

    @Bean
    public Person person() {
        return new Person('Sinni', age());
    }

    @Bean
    @Primary // if multiple 
    public Person person2(String name, int age) {
        return new Person('Shanky', age);
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringBean.class);
		System.out.println(context.getBean(Person.class); // will return Person2
    }
}
```
3. If you have multiple candidate bean while fetching the bean, you can use **@Primary** so it does not throw exception when trying to access those beans.
4. In above example, if you do `context.getBean(Person.class)`, there are two signature matching , it will get the one with `Primary` annotation.
5. Configure autowiring of objects by Spring Bean. In below example, @ComponentScan:
   ```java
    @Configuration
    @ComponentScan // if Component(Class you want to create objects of, e.g. Person in this case)
                   // is in different package then you need to provide location of package in parenthesis, 
                   //@ComponentScan('com.spring.basics')
    public class SpringBean {
        @Component // Class you want to create objects of
        record Person(String name) {}

        @Bean
        public String name() {
            return "Sinni";
        }

        @Bean
        public String getPersonInfo(Person person) {
            System.out.println(person.hashCode());
            return person.toString();
        }
    }
   ```


