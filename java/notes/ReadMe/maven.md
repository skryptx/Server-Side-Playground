### Dependency Management vs Dependencies:

```xml
<dependencyManagement>
    <dependency>
        <dependency>
            <groupId>org.apache.activemq</groupId>
            <artifactId>activemq-amqp</artifactId>
            <version>${activemq.version}</version>
        </dependency>
    </dependency>
</dependencyManagement>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
	</dependency>
</dependencies>
```

DependencyManagement has the versions of packages that are required for the application.

Dependencies are the actual dependencies that will be downloaded by maven. Version will be referred from former tag. 

### Important Notes:
1. Name of the project = groupId(package name) + artifactId(class name).
2. 