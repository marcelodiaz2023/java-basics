import java.lang.Math;
import java.util.*;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 2 * (Math.PI * this.radius);
    }

    public double circumference() {
        return Math.PI * (Math.pow(this.radius, 2));
       
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Circle circle1 = new Circle(12.3);
        System.out.println("--- Circle Calculator ---");
        System.out.println("Enter the radius: ");
        circle1.setRadius(s.nextDouble());
        
        System.out.println(String.format("radius: %s, area: %.2f, circumference: %.2f", circle1.getRadius(),
                circle1.area(), circle1.circumference()));
    }
}
