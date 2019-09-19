// This is an interface which has one abstract method
@FunctionalInterface
interface MyFunctionalInterface {
    public String sayHello();
}

// The Exmaple Class Uses a MyFunctionalInterface and describes the content of the method
public class Example {
    public static void main(String args[]) {
        // msg is an object of MyFunctionalInterface
        // () -> {} ----> Indicates that the it takes no arguments and the following is body of the method and assigned to the msg 
        MyFunctionalInterface msg = () -> {
            return "Hello World...!";
        };
        // Call the sayHello() method with the described body
        System.out.println(msg.sayHello());


        MyFunctionalInterface msg2 = () -> {
            return "Hello Java8..!";
        };

        System.out.println(msg2.sayHello());
    }
}
