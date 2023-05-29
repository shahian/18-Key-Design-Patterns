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
Prototype pattern is a creational design pattern that allows creating copies of existing objects, without exposing their underlying implementation. It involves creating a prototype object, which can be cloned to create new instances of the same object.

The Prototype pattern can be compared to making copies of a fully prepared example. Just like making copies of a prepared example, the Prototype pattern involves creating a template object (the prototype) that is already fully configured with the desired properties and behaviors. The new objects are then created by cloning the prototype object and modifying its properties as needed.

The main advantage of the Prototype pattern is that it allows creating new objects without having to create them from scratch, which can save time and resources. Additionally, because the new objects are created from a prototype object, they have the same initial configuration, which can help ensure consistency across multiple instances of the same object.

A common use case for the Prototype pattern is when creating complex objects that require a lot of configuration. By creating a prototype object that is already configured, the developer can avoid having to repeat the same configuration steps for each new object.

Some common use cases for the Prototype pattern include:

1. Creating complex objects that require a lot of configuration or data to be generated.
2. Creating objects that are similar to existing objects, but with some differences in their configuration or behavior.
3. Creating objects that need to be initialized with a lot of data or configuration that does not change frequently.
4. Creating objects that need to be copied or serialized/deserialized.

***
### singleton
Singleton is a design pattern in object-oriented programming that ensures that only one instance of a class is created and made available to the entire system. It guarantees that the class has only one instance, and provides a global point of access to that instance.

The Singleton pattern is often used in situations where a single instance of a class needs to coordinate actions across an entire system. For example, a logging system that needs to record events from multiple parts of a program would benefit from having a single, globally accessible instance that could coordinate those events. Another example might be a database connection pool that needs to manage connections across multiple threads.

To implement the Singleton pattern, the class in question must have a private constructor to prevent external instantiation, and a static method that returns the single instance of the class. This method is responsible for creating the instance if it doesn't already exist, and returning it if it does.

One important consideration when implementing the Singleton pattern is thread safety. If multiple threads attempt to access the Singleton instance at the same time, it is possible to create multiple instances. To prevent this, synchronization mechanisms such as locks or double-checked locking can be used.

While the Singleton pattern can be useful in certain situations, it can also be overused, leading to tightly coupled code and decreased flexibility. Therefore, it's important to carefully consider whether the Singleton pattern is the best solution for a particular problem before implementing it.
***

### adapter
The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two interfaces, converting the interface of one object into another interface that clients expect. It can be compared to a universal plug that connects devices with different plugs into a power outlet.

The Adapter pattern is useful when you have existing classes or components with different interfaces that need to collaborate without modifying their existing code. Instead, you create an adapter class that implements the target interface expected by the client and internally delegates the requests to the adapted object with the incompatible interface.

By using the Adapter pattern, you can achieve seamless integration between incompatible interfaces and enable collaboration between different components or systems. It promotes code reusability and ensures that existing code remains unaffected while enabling interoperability between different parts of a system.
***

### bridge
Bridge is a design pattern that allows you to decouple an abstraction from its implementation so that the two can vary independently. It is often used when you want to connect two related objects, but don't want to hardcode them together. The Bridge pattern defines an abstraction, and then provides an interface for the implementation of the abstraction. This allows for a greater degree of flexibility in how the abstraction is implemented, without affecting the clients that use the abstraction.

In simple terms, you can think of the Bridge pattern as a function connector. It links how an object works to what it does. It enables you to separate the interface from the implementation, so that you can change the implementation without changing the interface. The Bridge pattern is commonly used in scenarios where there are multiple ways of achieving the same result, or where you need to change the behavior of an object dynamically.
***

### composite
Composite is a design pattern that allows you to compose objects into tree-like structures to represent part-whole hierarchies. It enables clients to treat individual objects and compositions of objects uniformly. The Composite pattern consists of two key components: the Component and the Composite.

The Component represents the interface for all objects in the composition, whether they are simple or complex. It defines common operations that can be performed on both individual objects and compositions of objects.

The Composite represents a complex object that can contain other components, forming a tree-like structure. It implements the operations defined in the Component interface by delegating them to its child components. This allows clients to interact with the Composite object in the same way as they would with an individual object.

The Composite pattern is useful when you need to represent part-whole hierarchies and want to treat individual objects and compositions uniformly. It allows you to build tree-like structures where both individual objects and groups of objects can be treated as a single entity. This pattern promotes code reusability, simplifies the client code, and provides flexibility in manipulating complex structures.

An example scenario for using the Composite pattern could be building a hierarchical organization structure. Each component in the hierarchy, such as departments, teams, or employees, can be represented as a Composite object. The Composite object can contain other Composite objects or individual objects, allowing you to represent the entire organization structure as a tree-like composition.

By using the Composite pattern, you can easily add, remove, or traverse components in the hierarchy, regardless of whether they are individual objects or substructures. This promotes flexibility, maintainability, and extensibility in handling complex part-whole relationships.
***
### decorator

Decorator pattern, also known as the Wrapper pattern, is a design pattern that allows behavior to be added to an individual object dynamically. It provides a flexible alternative to subclassing for extending the functionality of an object without changing its core structure.

In the context of the Decorator pattern, the analogy of a "Customizer" is fitting. Just as a customizer adds features or customizations to an existing object without altering its fundamental properties, the Decorator pattern allows additional responsibilities to be added to an object dynamically.

The key idea behind the Decorator pattern is to create a set of decorator classes that wrap the original object and provide additional functionality. Each decorator implements the same interface as the original object, allowing them to be used interchangeably. Decorators can add new behavior before or after the execution of the original object's methods, effectively extending its functionality.

By using the Decorator pattern, you can achieve a more flexible and modular design, as you can mix and match decorators to add specific features to objects as needed. This avoids the need for creating numerous subclasses to handle different combinations of features.

An example in the context of a car could be a "CustomizedCar" class that acts as a decorator for a base "Car" object. The "CustomizedCar" class could add additional features such as a sunroof, alloy wheels, or a premium sound system without modifying the core functionality of the base "Car" class.

In this example, the Car interface represents the component interface, and the BasicCar class is the concrete component that implements this interface.

The CarDecorator class is the decorator abstract class that implements the Car interface and maintains a reference to the decorated car object. It acts as a base class for concrete decorators.

The SunroofDecorator and AlloyWheelsDecorator are concrete decorators that extend the CarDecorator class. They add specific features (sunroof and alloy wheels) by overriding the assemble method and invoking the same method on the decorated car object.

In the Main class,  its demonstrate the usage of decorators by creating different combinations of decorated cars. The assemble method is called on each decorated car, and the output shows the added features along with the basic car.

By using decorators, we can dynamically add features to a car object without altering its core structure. We can easily combine different decorators to customize cars with various combinations of features.
***

### facade

Facade is a structural design pattern that provides a simplified interface to a complex system, making it easier to use and understand. It acts as a "one-stop-shop" that encapsulates the interactions and complexities of multiple subsystems behind a unified interface.

In the context of Java design patterns, a Facade is typically implemented as a separate class or module that serves as an entry point for client code. It hides the complexities of the underlying system and provides a simplified set of methods or operations that clients can use to interact with the system.

The key benefits of using the Facade pattern are:

1- Simplified interface: The Facade provides a simplified and high-level interface that shields clients from the complexities of the underlying subsystems. It presents a unified interface that is easy to understand and use.

2- Subsystem decoupling: The Facade promotes loose coupling between clients and the subsystems. Clients only need to interact with the Facade and are not exposed to the details of individual subsystems. This allows for better maintainability and flexibility, as changes in the subsystems can be isolated within the Facade.

3- Improved usability: By providing a higher-level interface, the Facade enhances the usability of the system. It hides the intricate details and provides a more intuitive and convenient way for clients to interact with the system.

In this example, we have a Car Facade (CarFacade) that provides a simplified interface for starting and stopping a car. Behind the scenes, the facade interacts with the subsystems: Engine (Engine), Fuel System (FuelSystem), and Ignition System (IgnitionSystem).

The CarFacade class encapsulates the complexities of interacting with the subsystems. It provides methods startCar() and stopCar() that internally coordinate the actions required to start and stop the car. Clients can simply use the facade to control the car without needing to know the details of how each subsystem works.

When the client code executes the startCar() method, it internally opens the fuel valve, starts the engine, ignites the ignition system, and displays a message indicating that the car has started. Similarly, when the stopCar() method is called, it stops the engine, extinguishes the ignition system, closes the fuel valve, and displays a message indicating that the car has stopped.

The Car Facade pattern simplifies the interaction with complex subsystems and provides a convenient and unified interface for clients to control the car's operations.
In this example of code that exist, we have a Car Facade (CarFacade) that provides a simplified interface for starting and stopping a car. Behind the scenes, the facade interacts with the subsystems: Engine (Engine), Fuel System (FuelSystem), and Ignition System (IgnitionSystem).

The CarFacade class encapsulates the complexities of interacting with the subsystems. It provides methods startCar() and stopCar() that internally coordinate the actions required to start and stop the car. Clients can simply use the facade to control the car without needing to know the details of how each subsystem works.

When the client code executes the startCar() method, it internally opens the fuel valve, starts the engine, ignites the ignition system, and displays a message indicating that the car has started. Similarly, when the stopCar() method is called, it stops the engine, extinguishes the ignition system, closes the fuel valve, and displays a message indicating that the car has stopped.

The Car Facade pattern simplifies the interaction with complex subsystems and provides a convenient and unified interface for clients to control the car's operations.
***

### flyweight
Flyweight is a design pattern in software engineering that aims to minimize the memory usage and improve performance of an application by sharing as much data as possible between multiple objects instead of allocating new memory for each object. The idea is to create small, reusable objects called "flyweights" that can be shared among multiple contexts, rather than creating new objects for each context. This helps reduce the overall memory footprint of the application and can lead to significant performance improvements. Flyweight is often used in situations where there are potentially large numbers of small objects that need to be created and managed, such as in graphical user interfaces or video games.

The Flyweight design pattern, often referred to as the "Space Saver," is used to efficiently share and reuse small, granular objects in order to conserve memory and improve performance. The key idea behind the Flyweight pattern is to separate the intrinsic and extrinsic states of objects.

The intrinsic state represents the shared, immutable data that can be shared among multiple objects. On the other hand, the extrinsic state represents the context-specific, variable data that is unique to each object. By separating these states, the Flyweight pattern allows multiple objects to share the intrinsic state, while storing the extrinsic state separately.

The Flyweight pattern focuses on optimizing the memory usage by reusing existing objects instead of creating new ones. This is achieved by introducing a Flyweight factory that manages a pool of shared flyweight objects. When a client requests a flyweight object, the factory either returns an existing object from the pool or creates a new one if it doesn't exist.

By sharing small, reusable objects, the Flyweight pattern offers several benefits:

1- Reduced memory usage: The Flyweight pattern conserves memory by sharing common intrinsic state among multiple objects. Instead of each object holding its own copy of the intrinsic state, they refer to a shared instance, thereby reducing memory consumption.

2- Improved performance: With shared flyweight objects, the creation and initialization overhead are minimized. This can lead to improved performance, especially when dealing with a large number of objects.

3- Enhanced scalability: The Flyweight pattern allows for the efficient management of a large number of fine-grained objects. By reusing objects, it reduces the overall number of objects in the system, which can improve scalability and accommodate more objects within the available memory limits.

4- Flexible and lightweight design: The Flyweight pattern promotes a more flexible and lightweight design by separating the intrinsic and extrinsic states. Objects become simpler and can be easily shared and reused in different contexts.

It's important to note that the Flyweight pattern is most effective when there are a large number of similar objects with shared characteristics. By identifying the commonalities and separating the intrinsic and extrinsic states, the Flyweight pattern can significantly optimize memory usage and improve the performance of the system.
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










