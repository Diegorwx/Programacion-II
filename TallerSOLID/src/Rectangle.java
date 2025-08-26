public class Rectangle implements Shape {
    private final double width;
    private final double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }

    // Implemento el metodo de la interface Shape
    @Override
    public double getArea() {
        return width * height;
    }
}