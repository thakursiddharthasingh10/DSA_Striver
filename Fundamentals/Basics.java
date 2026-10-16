//(Write Once, Run Anywhere)

// 1. Sample Code
public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //2. Comments
        // This is a single line comment

        /* 
           This is a 
           multi-line comment 
        */

        //3. Data Types
        /*Java has 8 primitive data types to store different values.
        
        byte: 1 byte, small integers (-128 to 127)
        short: 2 bytes, integers
        int: 4 bytes, integers (Most common)
        long: 8 bytes, large integers
        float: 4 bytes, decimals (needs 'f' suffix, e.g., 3.14f)
        double: 8 bytes, decimals (Most common for fractions)
        char: 2 bytes, single character (e.g., 'A')
        boolean: 1 bit, true or false
        */

        /*4. Operators
        Arithmetic Operators
        + (Addition): Adds two values.
        - (Subtraction): Subtracts the right operand from the left.
        * (Multiplication): Multiplies two values.
        / (Division): Divides the left operand by the right.
        % (Modulo): Returns the remainder of a division operation.
        Unary Operators
        Operators that require only one operand.
        
        ++ (Increment): Increases a value by 1.
        -- (Decrement): Decreases a value by 1.
        ! (Logical NOT): Inverts the boolean value.
        Relational Operators
        Used to compare two values. They return a boolean result (true or false).
        
        == (Equal to): Checks if two values are equal.
        != (Not equal to): Checks if two values are not equal.
        > (Greater than): Checks if the left value is greater than the right.
        < (Less than): Checks if the left value is less than the right.
        >= (Greater than or equal to): Checks if the left value is greater than or equal to the right.
        <= (Less than or equal to): Checks if the left value is less than or equal to the right.
        Logical Operators
        Used to determine the logic between variables or values.
        
        && (Logical AND): Returns true if both statements are true.
        || (Logical OR): Returns true if at least one of the statements is true.
        Assignment Operators
        Used to assign values to variables.
        
        = (Assignment): Assigns the value on the right to the variable on the left.
        += (Add and Assign): Adds a value to the variable and assigns the result.
        -= (Subtract and Assign): Subtracts a value from the variable and assigns the result.
        *= (Multiply and Assign): Multiplies the variable by a value and assigns the result.
        /= (Divide and Assign): Divides the variable by a value and assigns the result.
        %= (Modulo and Assign): Assigns the remainder of the division to the variable. */

        //5. Strings
        /*Strings are objects in Java, not primitives. They store text.
        Immutable: Once created, a String object cannot be changed. Modifying it creates a new object.*/
        String s1 = "Hello";
        char[] arr = { 'W', 'o', 'r', 'l', 'd' };
        String s2 = new String(arr); // char array to string

        System.out.println(s1 + " " + s2); // Concatenate: Hello World
        System.out.println(s1.charAt(1)); // Char at index 1: 'e'
        System.out.println(s1.length()); // Length: 5
        System.out.println(s1.substring(0, 2)); // Substring: "He"
        System.out.println(s1.equals("Hello")); // Check content equality: true


        /*6. Input Output
        For input, we use the Scanner class.
        import java.util.Scanner;
        public class InputExample {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();
        System.out.println(name + " is " + age);
        sc.close();
        }
        }
        What about BufferedReader?
        BufferedReader is another way to read input. It is faster but harder to use (requires parsing strings to numbers manually). Scanner is easier and preferred for beginners. */

/*7. Type Casting
Converting one data type to another.

Implicit (Widening): Small type to large type (e.g., int to double). This happens automatically by the compiler.
Explicit (Narrowing): Large type to small type (e.g., double to int). This must be done manually by the programmer.*/
int myInt = 9;
double myDouble = myInt; // Automatic casting: 9.0
int heavyInt = (int) 9.78; // Manual casting: 9 (fraction lost)

/*8. Constants
Use the final keyword to create constants. These values cannot be changed.*/

final float PI = 3.14f;
// PI = 3.15f; // This will cause an error

//9. Arrays
//Storing multiple values of the same type.

int[] scores = {90, 80, 70};
System.out.println(scores.length); // 3
System.out.println(scores[0]); // 90
// For-Each Loop
for (int i : scores) {
    System.out.println(i);
}
// 2D Array
int[][] matrix = { {1, 2}, {3, 4} };

/*10. Conditional Statements
If, Else If, Else*/
int marks = 85;
if (marks > 90) {
    System.out.println("A");
} else if (marks > 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}
//Explanation: The program checks the condition marks > 90. Since 85 is not greater than 90, it moves to the next condition marks > 80. This is true, so it prints "B". The rest of the chain is skipped.

//Switch
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid");
}
//Explanation: The computer checks the value of day. It matches with case 2 and executes the code inside it.

//break: This keyword stops the code from running into the next case automatically (no "fall-through").
//default: This runs if no case matches the value (like an else).

//11. Loops
//For Loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
//While Loop
int j = 0;
while (j < 5) {
    System.out.println(j);
    j++;
}
//Do While Loop
int k = 0;
do {
    System.out.println(k); // Runs at least once
    k++;
} while (k < 5);

//12. Exception Handling
//Handling errors so the program doesn’t crash.

try {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]); // Error
} catch (Exception e) {
    System.out.println("Something went wrong.");
} finally {
    System.out.println("The 'try catch' is finished.");
}
/*Summary
We covered the fundamental building blocks of Java:

Structure: Class based, main method
Data: Types, Variables, Arrays, Strings
Logic: Operators, If-Else, Switch
Control: Loops (for, while)
Safety: Exception Handling */
    }
}

//JAVA OOPS
/*
Java OOPs Basic
Object-Oriented Programming, often abbreviated as OOP, is a programming paradigm based on the concept of Classes and Objects, which can contain data and code to manipulate that data. Understanding OOP is vital as it allows for more organized, modular, and reusable code, which is particularly important when dealing with complex problems in Data Structures and Algorithms.

Classes and Objects
Class: In Java, a class serves as a blueprint or a template for creating objects. A class encapsulates data for the object and methods to manipulate that data. Code in Java is typically defined within a class, as Java is an object-oriented programming language, which means that almost everything revolves around the concept of objects and classes.

Object: An object is an instance of a class. When a class is defined, no memory is allocated or action performed until an object is created from that class. An object is a real-world entity that represents the specific instance of the blueprint (class). It holds actual data in the form of attributes and can perform actions using the methods defined in the class.

Access Specifiers:
Access specifiers in Java determine the visibility and accessibility of classes, methods, and variables. The most common access specifiers are:

public: When a class or method is declared as public, it is accessible from anywhere in the program.
private: Declaring something as private restricts its access to within the class it is declared in.
protected: A protected entity is accessible within its own package and by subclasses.
If no access specifier is used, Java assigns a default access level, known as package-private, meaning the class or method is accessible only within its own package.
The Main Method and Its Role:
Here is a code snippet to print "Hello World" on the console in Java.

class Basics {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
Let us understand this code snippet piecewise.

Basics(Class Name): In the code snippet, the class name is "Basics" which must resemble the name of the Java file for proper execution.

Main method: The main method in Java serves as the entry point for any Java application. The Java runtime starts the execution of a program with the main method.

public (Access Specifier): In the code snippet, the access specifier given to the main class is public allowing it to be accessed from anywhere in the program.

static Keyword: The static keyword is crucial because it allows the Java Virtual Machine (JVM) to call the main method without creating an instance of the class. This is necessary because the main method is executed before any objects of the class are created.

void: This represents the return type of the main method. It is kept void if nothing is returned from the function.

String[] args: This is required to store the Command Line Inputs (if passed) when executing the JAVA program using a Command Line.

Statement: A statement to print "Hello World" is added inside the main method.
Static Methods:
A static method belongs to the class rather than any instance of the class. This allows for calling a static method directly using the class name without the need to create an object. For example:

ClassName.methodName();
This is particularly useful for utility or helper methods that perform tasks independent of any object's state.
Creating and Using Objects:
In Java, objects are instances(copies) of classes. To access non-static methods, an object of the class must be created using the new keyword, followed by the class constructor. For example:

ClassName objName = new ClassName();
Now, the objects are instances of class. It holds actual data in the form of attributes and can perform actions using the methods defined in the class. For example:
// Test class
class Test {
    int age;
    public void assignAge(int num) {
        // Assign the number to age
        age = num;
    }
}
class Basics {
    public static void main(String[] args) {
        // Creating an object having name test1 of Test class
        Test test1 = new Test();
        test1.assignAge(10); // Assigning age 10 to test1 object
        
        // Creating an object having name test2 of Test class
        Test test2 = new Test(); 
        test2.assignAge(19); // Assigning age 19 to test2 object
        
        System.out.println(test1.age);
        System.out.println(test2.age);
    }
}
In the above code snippet, there are two objects (instances) of Test Class that are created. Both are assigned a different value of age. Since, all the objects are independent from each other, object named "test1" will hold the age 10, whereas object names "test2" will hold the age 19.

Note: All the objects created of a particular class are completely independent from each other. Any changes done in one object will not reflect in others.
Arguments in Methods:
Arguments are the values or variables passed to a function or method when it is called. These arguments provide the necessary inputs that the function uses to perform its operations. For example:

// Test class
    class Test {
        public int sum(int num1, int num2) {
            // Return the sum
            return num1 + num2;
        }
    }
    
    class Basics {
        public static void main(String[] args) {
            // Creating an object of class Test
            Test test = new Test();
            
            // Sum two numbers using test object
            int sum = test.sum(10, 15);
            
            // Display the result
            System.out.println(sum);
        }
    }
This program contains a class named Test, having a method named sum which takes two integer values num1 and num2 as it's arguments. When this method is called, two values 10 and 15 are passed as parameters for the method which get stored in the variables num1 and num2 respectively.
Constructors:
In Object-Oriented Programming (OOP) in Java, a constructor is a special type of method used to initialize objects. It is called automatically when an object of a class is created. The constructor's main role is to set initial values for the object's attributes and perform any necessary setup tasks. Key Points:

Same Name as Class: A constructor has the same name as the class it belongs to.
No Return Type: Constructors do not have a return type, not even void.
Called Automatically: When an object is created using the new keyword, the constructor is called automatically.
Types of Constructors: Java provides two types of constructors: Default Constructor and Parameterized Constructor.
Types of Constructors:
Default Constructor: A default constructor is a constructor that has no parameters. If no constructor is defined in a class, Java automatically provides a default constructor that initializes object fields to their default values
Parameterized Constructor: A parameterized constructor allows passing arguments to the constructor so that specific values can be assigned to object attributes at the time of creation.
Note: In Java, a class can have multiple constructors, a concept known as constructor overloading. This allows the class to have different constructors with varying parameters. Each constructor can perform different initializations based on the number or type of arguments passed during object creation.
Encapsulation:
Encapsulation is one of the core concepts of Object-Oriented Programming (OOP). It refers to the practice of bundling data (variables) and methods (functions) that operate on the data into a single unit, known as a class, and restricting direct access to the data from outside the class.

Key Points:

Data Hiding: Encapsulation hides the internal details of how an object works. The object's data is kept private and can only be accessed or modified through methods (getters and setters).
Controlled Access: Through encapsulation, only specific methods are provided to access or modify the data, ensuring more controlled and secure interactions with the object's data.
For example:
class BankAccount {
    private int balance;  // Private variable (data hiding)
    // Public method to access the balance
    public int getBalance() {
        return balance;
    }
    // Public method to modify the balance
    public void setBalance(int newBalance) {
        balance = newBalance;
    }
}
In this example, the balance variable is private, so it can't be accessed directly from outside the BankAccount class. It can only be accessed or modified using the getBalance() and setBalance() methods, which provide controlled access to the data.
Inheritence:
Inheritance is a core concept of Object-Oriented Programming (OOP) that allows a class to inherit properties and behaviors (fields and methods) from another class. It helps in reusing existing code and creating a hierarchical relationship between classes.

Key Points:

Parent (Superclass) and Child (Subclass): In inheritance, the class that is inherited from is called the parent class (or superclass), and the class that inherits is called the child class (or subclass).
Reuse of Code: The child class automatically gets the properties and methods of the parent class, so there is no need to rewrite the same code.
Extending Functionality: The child class can add new features or override existing ones to modify the behavior inherited from the parent class.
// Base class
    class Vehicle {
        private String VehicleNumber;
        
        public Vehicle(String VehicleNumber) {
            this.VehicleNumber = VehicleNumber;
        }
        
        public void honk() {
            System.out.println("Honk !!!!!!!!!!!");
        }
        
        public void printVehicleNumber() {
            System.out.println(VehicleNumber);
        }
    }
    
    // Derived class
    class Car extends Vehicle{
        public Car(String CarNumber) {
            super(CarNumber);
        }
    }
    
    // Derived class
    class Bus extends Vehicle{
        public Bus(String BusNumber) {
            super(BusNumber);
        }
    }
    
    class Main {
        public static void main(String[] args) {
            Car car = new Car("AB12CD2345");
            car.printVehicleNumber();
            car.honk();
            
            Bus bus = new Bus("XY23MN5678");
            bus.printVehicleNumber();
            bus.honk();
        }
    }
In this example, the Derived Classes(Car and Bus) inherit the methods(honk() and printVehicleNumber()) from the Base Class(Vehicle). Note that the Derived Classes can have their own additional methods and variables different from the Base class.
Polymorphism:
Polymorphism is a concept in Object-Oriented Programming (OOP) that allows objects to be treated as instances of their parent class or interface, while having the ability to take on different forms or behaviors. It enables the same method to perform different actions depending on the object calling it.

Key Points:

Two types of Polymorphism:
Compile-time Polymorphism (Method Overloading): The ability to have multiple methods in the same class with the same name but different parameters.
Runtime Polymorphism (Method Overriding): The ability of a subclass to provide a specific implementation of a method that is already defined in its parent class.
Method Overloading: Multiple methods can have the same name but different parameter lists (number or type of parameters).
Method Overriding: A method in the child class can have the same name and parameters as in the parent class, but the child class provides its own implementation.
// Base class
class Vehicle {
    private String VehicleNumber;
    
    public Vehicle(String VehicleNumber) {
        this.VehicleNumber = VehicleNumber;
    }
    
    public void honk() {
        System.out.println("Honk !!!!!!!!!!!");
    }
    
    public void printVehicleNumber() {
        System.out.println(VehicleNumber);
    }
}
// Derived class
class Car extends Vehicle{
    public Car(String CarNumber) {
        super(CarNumber);
    }
    
    @Override
    public void honk() {
        System.out.println("Car Honk !!!!!!!");
    }
}
// Derived class
class Bus extends Vehicle{
    public Bus(String BusNumber) {
        super(BusNumber);
    }
}
class Main {
    public static void main(String[] args) {
        Car car = new Car("AB12CD2345");
        car.printVehicleNumber();
        car.honk();
        
        Bus bus = new Bus("XY23MN5678");
        bus.printVehicleNumber();
        bus.honk();
    }
}
The above code provides an example of Method Overriding where the honk() method of the Vehicle(Base class) is overridden in the Car (Derived Class).
Abstraction:
Abstraction is a core concept of Object-Oriented Programming (OOP) in Java that focuses on hiding complex implementation details and exposing only the essential features of an object or method. It helps simplify programming by only showing what is necessary and keeping internal workings hidden.

Key Points:

Hides Complexity: Abstraction allows a user to interact with an object or method without needing to understand the underlying details of how it works.
Simplifies Interaction: Only the important aspects are exposed, making it easier to use the object or method.
Example: A real-world example of abstraction is a car. A driver only interacts with the steering wheel and pedals without knowing how the engine works internally.

In Java, the abstraction can be achieved in two ways:
Abstract Classes
Interfaces
1. Abstract Class
An abstract class is a class that cannot be instantiated directly. It can have both abstract methods (methods without a body) and regular methods (methods with a body). Abstract methods are intended to be implemented by subclasses, ensuring that each subclass provides its own specific implementation of the method.

Key Points about Abstract Classes:
Cannot be Instantiated: An abstract class cannot be used to create objects directly. It must be inherited by a subclass, and only the subclass can be instantiated.
Abstract Methods: These are methods without implementation in the abstract class, and the subclasses are required to provide their own implementations.
Can Have Regular Methods: Along with abstract methods, an abstract class can also have fully defined methods.
abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();
    // Regular method
    void sleep() {
        System.out.println("This animal sleeps.");
    }
}
// Subclass providing implementation for abstract method
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}
In this example, Animal is an abstract class with an abstract method sound(). The subclass Dog must provide its own implementation for sound(), while it can also inherit and use the regular method sleep().
2. Interfaces
In Java, abstraction can also be achieved using interfaces. An interface is a completely abstract type that defines a contract for classes to implement. It contains only abstract methods (prior to Java 8), which must be implemented by any class that "implements" the interface. From Java 8 onwards, interfaces can also contain default and static methods with implementation.

Key Points about Interfaces:
Pure Abstraction: An interface only defines what methods should be present; the actual implementation is provided by the classes that implement the interface.
No Instantiation: Like abstract classes, interfaces cannot be instantiated. They only serve as a blueprint.
Multiple Implementation: A class can implement multiple interfaces, allowing for more flexibility compared to single inheritance in classes.
interface Animal {
    void sound(); // Abstract method (no body)
}
 
// Class implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks.");
    }
}
In this example, Animal is an interface, and the Dog class implements the sound() method. Any class that implements Animal must provide its own implementation of the sound() method.
Advantages of Abstraction with Interfaces:
Multiple Inheritance: A class can implement multiple interfaces, unlike classes that can only extend one class.
Loose Coupling: Interfaces help to reduce the dependencies between different parts of the code, making the system more modular and easier to maintain.

 */