public class Circle implements Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() { return radius; }

    // Implemento el metodo de la interface Shape
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}