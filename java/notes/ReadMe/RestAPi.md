### Rest Api Methods:
![Alt text](images/rest-api-methods.png)

 ```java
   @GetMapping("/courses/{id}")
   public Course getCourseById(@PathVariable long id) { 
      Optional<Course> filteredCourse = repository.getCourseById(1);
      if (filteredCourse.isEmpty()) {
         throw new RuntimeException("Course not found!");
      }

      return filteredCourse.get();
   }
```
1. 