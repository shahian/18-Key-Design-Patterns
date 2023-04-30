# 18-Key-Design-Patterns
Patterns are reusable solutions to common design problems, resulting in a smoother, more efficient development process. They serve as blueprints for building better software structures. 
 ## These are some of the most popular patterns:
1. [Abstract Factory: Family Creator - Makes groups of related items.](#abstractFactory)
2. [Builder: Lego Master - Builds objects step by step, keeping creation and appearance](#builder)
3. [Prototype: Clone Maker - Creates copies of fully prepared examples.](#prototype)
4. [Singleton: One and Only - A special class with just one instance.](#singleton)
5. [Adapter: Universal Plug - Connects things with different interfaces.](#adapter)
6. [Bridge: Function Connector - Links how an object works to what it does.](#bridge)
7. [Composite: Tree Builder - Forms tree-like structures of simple and complex parts.](#composite)
8. [Decorator: Customizer - Adds features to objects without changing their core.](#decorator)
9. [Facade: One-Stop-Shop - Represents a whole system with a single, simplified interface.](#facade)
10. [Flyweight: Space Saver - Shares small, reusable items efficiently.](#flyweight)
11. [Proxy: Stand-In Actor - Represents another object, controlling access or actions.](#proxy)
12. [Chain of Responsibility: Request Relay - Passes a request through a chain of objects until handled.](#chain)
13. [Command: Task Wrapper - Turns a request into an object, ready for action.](#command)
14. [Iterator: Collection Explorer - Accesses elements in a collection one by one.](#iterator)
15. [Mediator: Communication Hub - Simplifies interactions between different classes.](#mediator)
16. [Memento: Time Capsule - Captures and restores an object's state.](#memento)
17. [Observer: News Broadcaster - Notifies classes about changes in other objects.](#observer)
18. [Visitor: Skillful Guest - Adds new operations to a class without altering it](#visitor)

### abstractFactory
Abstract Factory is a creational design pattern that provides an interface for creating families of related objects without specifying their concrete classes. In other words, it allows you to create objects that are related to each other in some way, but without committing to specific classes that implement them.

The main idea behind the Abstract Factory pattern is to define an abstract class or interface that represents the "factory" for creating related objects. Concrete implementations of this factory interface provide actual implementations for creating specific objects, and ensure that all the objects they create are related in some way.

This pattern is useful in situations where you need to create families of related objects, but want to be able to swap out one family for another without affecting the rest of the code. It also allows you to encapsulate the creation of objects, making it easier to change or extend the way objects are created in the future.

In summary, the Abstract Factory pattern provides an interface for creating families of related objects, without committing to specific implementations. It promotes loose coupling and encapsulation, and makes it easier to change or extend the way objects are created in your code.
```
// Define the interface for creating cars
interface CarFactory {
    public Sedan createSedan();
    public SUV createSUV();
}

// Concrete factory for creating a family of related cars
class FamilyCarFactory implements CarFactory {
    public Sedan createSedan() {
        return new FamilySedan();
    }
    public SUV createSUV() {
        return new FamilySUV();
    }
}

// Abstract class for the car
abstract class Car {
    public abstract String getName();
    public abstract int getNumDoors();
}

// Concrete class for the sedan
class Sedan extends Car {
    public String getName() {
        return "Sedan";
    }
    public int getNumDoors() {
        return 4;
    }
}

// Concrete class for the SUV
class SUV extends Car {
    public String getName() {
        return "SUV";
    }
    public int getNumDoors() {
        return 5;
    }
}

// Concrete class for the family of sedan cars
class FamilySedan extends Sedan {
    public String getName() {
        return "Family Sedan";
    }
}

// Concrete class for the family of SUV cars
class FamilySUV extends SUV {
    public String getName() {
        return "Family SUV";
    }
}
```

To use the Abstract Factory pattern to create a family of related car objects, you can create an instance of the FamilyCarFactory and use it to create new cars:
```
CarFactory factory = new FamilyCarFactory();
Sedan sedan = factory.createSedan();
SUV suv = factory.createSUV();

System.out.println(sedan.getName() + " with " + sedan.getNumDoors() + " doors"); // Output: "Family Sedan with 4 doors"
System.out.println(suv.getName() + " with " + suv.getNumDoors() + " doors"); // Output: "Family SUV with 5 doors"
```
## Factory Method
Factory Method is also a creational design pattern, but it differs from the Abstract Factory pattern in that it provides an interface for creating a single object, rather than families of related objects.

In the Factory Method pattern, you define an interface or abstract class for creating objects, and concrete implementations of this interface provide actual implementations for creating specific objects. The main difference is that each concrete implementation of the Factory Method interface creates a different object.

This pattern is useful when you need to create objects based on certain conditions or parameters, but want to delegate the actual creation to a separate class. It also allows for easy extension and modification of the object creation process, since each implementation can provide its own logic for creating objects.

One example of the Factory Method pattern might be a Document class, which defines an abstract method for creating a DocumentReader object. Each subclass of Document can provide its own implementation for creating a DocumentReader object, based on the type of document being read. This allows for easy extension and modification of the DocumentReader creation process, without affecting the rest of the code.

In summary, the Factory Method pattern provides an interface or abstract class for creating a single object, and concrete implementations of this interface provide actual implementations for creating specific objects. It is useful when you need to create objects based on certain conditions or parameters, and allows for easy extension and modification of the object creation process.
```
// Define the interface for creating cars
interface CarFactory {
    public Car createCar();
}

// Concrete factory for creating sedan cars
class SedanFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }
}

// Concrete factory for creating SUV cars
class SUVFactory implements CarFactory {
    public Car createCar() {
        return new SUV();
    }
}

// Abstract class for the car
abstract class Car {
    public abstract String getName();
    public abstract int getNumDoors();
}

// Concrete class for the sedan
class Sedan extends Car {
    public String getName() {
        return "Sedan";
    }
    public int getNumDoors() {
        return 4;
    }
}

// Concrete class for the SUV
class SUV extends Car {
    public String getName() {
        return "SUV";
    }
    public int getNumDoors() {
        return 5;
    }
}
```
In this example, we have defined an interface CarFactory for creating cars, and two concrete factories SedanFactory and SUVFactory that create different types of cars. We have also defined an abstract class Car and concrete classes Sedan and SUV that extend Car.

To use the Factory Method pattern to create different types of cars, you can create an instance of the appropriate CarFactory and use it to create a new car:
```
CarFactory sedanFactory = new SedanFactory();
CarFactory suvFactory = new SUVFactory();

Car sedan = sedanFactory.createCar();
Car suv = suvFactory.createCar();

System.out.println(sedan.getName() + " with " + sedan.getNumDoors() + " doors"); // Output: "Sedan with 4 doors"
System.out.println(suv.getName() + " with " + suv.getNumDoors() + " doors"); // Output: "SUV with 5 doors"
```
***

### builder
***

### prototype
***
### singleton
***

### adapter
***

### bridge
***

### composite
***

### decorator
***

### facade
***

### flyweight
***

### proxy
***

### chain
***

### command
***

### iterator
***

### mediator
***

### memento
***

### observer
***

### visitor
***










