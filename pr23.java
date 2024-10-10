// Interface Shape
interface Shape {
    // Abstract method to calculate the area of the shape
    double area();

    // Abstract method to get the color of the shape
    String getColor();

    // Default method to display the shape's information
    default String shapeInfo() {
        return "This shape has a color of " + getColor();
    }
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;
    private String color;

    // Constructor to initialize radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Implementing area method from Shape interface
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Implementing getColor method from Shape interface
    @Override
    public String getColor() {
        return this.color;
    }

    // Additional method specific to Circle
    public double getRadius() {
        return radius;
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    // Constructor to initialize length, width, and color
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    // Implementing area method from Shape interface
    @Override
    public double area() {
        return length * width;
    }

    // Implementing getColor method from Shape interface
    @Override
    public String getColor() {
        return this.color;
    }

    // Additional methods specific to Rectangle
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

// Sign class to represent a sign with a shape and text
class Sign {
    private Shape shape;
    private String text;

    // Constructor to initialize shape and text
    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    // Method to display the sign information
    public void displaySign() {
        System.out.println("Sign Text: " + text);
        System.out.println("Background Shape Area: " + shape.area());
        System.out.println(shape.shapeInfo()); // Using the default method from the Shape interface
    }
}

// Main class to test the program
public class pr23 {
    public static void main(String[] args) {
        // Create a Circle and a Rectangle
        Shape circle = new Circle(5, "Red");
        Shape rectangle = new Rectangle(4, 6, "Blue");

        // Create two Signs using the shapes
        Sign circleSign = new Sign(circle, "Welcome to the Campus Center!");
        Sign rectangleSign = new Sign(rectangle, "Event in Progress");

        // Display the signs
        circleSign.displaySign();
        System.out.println();
        rectangleSign.displaySign();
    }
}
