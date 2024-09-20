public class SimpleMethodExample {

    // Method that takes two integers and returns their sum
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
feature202
#feature202 changes by ethan in oct 2023
public class RectangleAreaCalculator {

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


    // User-defined method to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        // Example of using the method
        double length = 5.0;
        double width = 3.0;

        // Calling the method
        double result = calculateRectangleArea(length, width);

        // Displaying the result
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + result);
    }
}
#end of feature202 changes
    public static void main(String[] args) {
        // Calling the method and storing the result
        int result = addNumbers(5, 7);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}
