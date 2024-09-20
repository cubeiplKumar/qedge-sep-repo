public class SimpleMethodExample {

    // Method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
#feature201 changes by vivek for the module reports on oct2023
public void accessPrivateMembers() {
        // Accessing the private field
        System.out.println("Private Field: " + privateField);

        // Calling the private method
        privateMethod();
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing private members through a public method
        myObject.accessPrivateMembers();
    }
}
#end of feature201 changes

    public static void main(String[] args) {
        // Calling the method and storing the result
        int result = addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
