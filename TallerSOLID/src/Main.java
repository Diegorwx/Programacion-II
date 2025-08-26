public class Main {
    public static void main(String[] args) {
       
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        Circle circle1 = new Circle(3.0);
        Triangle triangle1 = new Triangle(3.0, 4.0);


        Shape[] shapes = {rectangle1, circle1, triangle1};
        
        // Crear calculadora y calcular área total
        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.sum(shapes);
        
        // Mostrar resultados
        System.out.println("\n=== Calculadora de Áreas ===");
        System.out.println("Rectángulo 1: " + rectangle1.getWidth() + " x " + rectangle1.getHeight() + 
                          " = " + String.format("%.2f", rectangle1.getArea()));
        System.out.println("Círculo 1: radio " + circle1.getRadius() + 
                          " = " + String.format("%.2f", circle1.getArea()));
        System.out.println("Triángulo 1: " + triangle1.getBase() + " x " + triangle1.getHeight() + 
                          " = " + String.format("%.2f", triangle1.getArea()));
        
        System.out.println("\nÁrea total: " + String.format("%.2f", totalArea));
    }
}
