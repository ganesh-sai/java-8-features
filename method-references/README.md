# Method Refernce
Method reference is a shorthand notation of a lambda expression to call a method.


Ex: 
    Lamda Expression: 
        str -> System.out.println(str)
    
    replacement of above stmt as : 
        System.out::println
    

The :: operator is used in method refernce to seperate the class or object from the methods name (We will learn this with the help of examples) 

Four types of method references
1. Method refernce to an instance method of an object - object::instanceMethod
2. Method reference to a static method of a class - Class::staticMethod
3. Method reference to an instance method of an arbitary object of a particular type - Class::instanceMethod
4. Method reference to a constructor - Class::new

