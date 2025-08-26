public class AreaCalculator {
    public double sum(Shape[] shapes) {

        double totalArea = 0;
        for (Shape shape : shapes) {
        totalArea += shape.getArea();
        }
    return totalArea;
    }
}