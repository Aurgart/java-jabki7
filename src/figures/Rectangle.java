package figures;

/*
- Rectangle с полями width и height.
 */
public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Площадь
     *
     * @return площадь квадрата
     */
    @Override
    public double area() {
        return this.width * this.height;
    }
}
