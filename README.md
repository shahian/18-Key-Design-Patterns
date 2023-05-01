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
To disable or comment some lines in a README file on GitHub, you can use HTML comments. Here's an example of how to do it:
 
## Factory Method
Factory Method is also a creational design pattern, but it differs from the Abstract Factory pattern in that it provides an interface for creating a single object, rather than families of related objects.

In the Factory Method pattern, you define an interface or abstract class for creating objects, and concrete implementations of this interface provide actual implementations for creating specific objects. The main difference is that each concrete implementation of the Factory Method interface creates a different object.

This pattern is useful when you need to create objects based on certain conditions or parameters, but want to delegate the actual creation to a separate class. It also allows for easy extension and modification of the object creation process, since each implementation can provide its own logic for creating objects.

One example of the Factory Method pattern might be a Document class, which defines an abstract method for creating a DocumentReader object. Each subclass of Document can provide its own implementation for creating a DocumentReader object, based on the type of document being read. This allows for easy extension and modification of the DocumentReader creation process, without affecting the rest of the code.

In summary, the Factory Method pattern provides an interface or abstract class for creating a single object, and concrete implementations of this interface provide actual implementations for creating specific objects. It is useful when you need to create objects based on certain conditions or parameters, and allows for easy extension and modification of the object creation process.

***
### builder
The Builder pattern is a way of creating complex objects step by step, while keeping track of their creation and appearance. It allows you to separate the construction of an object from its representation, so that you can create different representations of the same object using the same construction process.

To use the Builder pattern, you define an interface or abstract class that represents the steps for building a complex object. Then, you create concrete implementations of this interface that provide the actual implementation for building specific objects.

Each concrete implementation of the builder interface defines a series of steps that must be taken to create the desired object. These steps can be added or removed as needed, so that you can easily modify the construction process without affecting the rest of the code.

Once the object has been fully constructed, the builder returns it to the client as a fully functional object that can be used as needed.

In summary, the Builder pattern is a way of creating complex objects step by step, while keeping track of their creation and appearance. It separates the construction of an object from its representation, allowing you to create different representations of the same object using the same construction process.

Imagine that you are building a car manufacturing system. You want to be able to create different types of cars (e.g. sedan, sports car, SUV) using the same construction process. To do this, you could use the Builder pattern.

First, you define an interface called CarBuilder that represents the steps for building a car. The CarBuilder interface might include methods like addEngine(), addWheels(), addDoors(), and addColor().

Next, you create concrete implementations of the CarBuilder interface for each type of car you want to create. For example, you might create a SportsCarBuilder, a SedanBuilder, and an SUVBuilder. Each of these builders would provide a unique implementation for building the respective type of car.

Once you have defined your builders, you can start using them to create cars. To do this, you would create a CarFactory class that takes a CarBuilder object as a parameter and uses it to build a car. The CarFactory class might have a method like buildCar() that calls the necessary methods on the builder to construct the car.

For example, if you wanted to create a sports car, you would create a SportsCarBuilder object and pass it to the CarFactory's buildCar() method. The CarFactory would then use the SportsCarBuilder to construct the car, calling methods like addEngine(), addWheels(), and addColor() as needed.

Once the car has been fully constructed, the CarFactory returns it to the client as a fully functional object that can be used as needed.

In summary, the Builder pattern allows you to create different types of cars using the same construction process. You define an interface that represents the steps for building a car, and create concrete implementations of this interface for each type of car you want to create. You then use a CarFactory class to construct the car, passing in the appropriate CarBuilder object as needed.
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










