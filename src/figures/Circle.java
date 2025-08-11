package figures;

/*
- Circle с полем radius.
 */
public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Площадь.
     *
     * @return площадь круга
     */
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
