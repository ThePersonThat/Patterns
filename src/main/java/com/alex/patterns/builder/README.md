# Builder
## Problems can be solved
* If you need to build a complex object with optional fields.
## UML
![img_1.png](images/img.png)
## Additional information
Sometimes this pattern can be found with "Director" class (UML). It used for building
finished objects and at certain stages and with certain properties. 
I have often met this pattern without "Director" class, 
usually the user has the opportunity to construct the properties by himself.
```java
    /* with Director */
    Director director = new Director();
    CarBuilder builder = new CarBuilder();
    /* build a car at certain stages and with certain properties */
    Car car = builder.buildSomeCar();
    
    /* without director */
    Car car = new CarBuilder()
            .setSpeed(100).setHeight(30)
            .build();
```
## Extra resources
* https://refactoring.guru/design-patterns/builder