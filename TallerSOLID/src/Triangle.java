public class Triangle implements Shape {
    private final double base;
    private final double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double getBase() { 
        return base; 
    }
    
    public double getHeight() { 
        return height; 
    }

    // Implemento el metodo de la interface Shape
    @Override
    public double getArea() {
        return (base * height) / 2.0;
    }
}
