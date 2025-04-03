
interface Printable {
    void printDetails();
}


interface Drawable {
    void draw();
}


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person implements Printable {
    String employeeId;
    String department;

    Employee(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    @Override
    public void printDetails() {
        displayInfo(); // Inherited from Person
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}


class Circle implements Drawable, Printable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    @Override
    public void printDetails() {
        System.out.println("Circle radius: " + radius);
        System.out.println("Area: " + Math.PI * radius * radius);
    }
}


class Book implements Printable {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Interfaces{
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, "E123", "Engineering");
        Circle circle = new Circle(5.0);
        Book book = new Book("Java Programming", "John Doe");

        System.out.println("Employee Details:");
        emp.printDetails();

        System.out.println("\nCircle Details:");
        circle.draw();
        circle.printDetails();

        System.out.println("\nBook Details:");
        book.printDetails();
    }
}