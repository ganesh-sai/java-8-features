@FunctionalInterface
interface MyInterface{
    void display();
}

public class Example {

    public void myMethod(){
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        Example oExample = new Example();
        // Method reference using the object of the class
        MyInterface ref = oExample::myMethod;

        ref.display();
    }
}