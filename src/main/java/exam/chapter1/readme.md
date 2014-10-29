#Nonaccessed modifiers

 - synchronized—A synchronized method can’t be accessed by multiple threads concurrently.

 - native—A native method calls and makes use of libraries and methods implemented in other
        programming languages such as C or C++.

 - transient—A transient variable isn’t serialized when the corresponding object is serialized.

 - volatile—A volatile variable’s value can be safely modified by different threads.

 - strictfp—Classes, interfaces, and methods defined using this keyword ensure that calculations
        using floating-point numbers are identical on all platforms.

##ABSTRACT CLASS
When the abstract keyword is prefixed to the definition of a concrete class, it
changes it to an abstract class, even if the class doesn’t define any abstract methods.

##ABSTRACT METHOD
An abstract method doesn’t have a body.

##FINAL CLASS
A class that is marked final cannot be extended by another class.

##FINAL VARIABLE
A final variable can’t be reassigned a value.

##FINAL METHOD
A final method defined in a base class can’t be overridden by a derived class.

##STATIC VARIABLES
static variables belong to a class. They are common to all instances of a class and
aren’t unique to any instance of a class. static attributes exist independently of any
instances of a class and may be accessed even when no instances of the class have been
created. You can compare a static variable with a shared variable. A static variable
is shared by all of the objects of a class.

##STATIC METHODS
static methods aren’t associated with objects and can’t use any of the instance variables
of a class.

##WHAT CAN A STATIC METHOD ACCESS?
Neither static methods nor static variables can access the non-static variables and
methods of a class. But the reverse is true: non-static variables and methods can access
static variables and methods because the static members of a class exist even if no
instances of the class exist. static members are forbidden from accessing instance
methods and variables, which can exist only if an instance of the class is created.