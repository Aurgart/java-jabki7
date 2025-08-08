package figures;
/*
Создайте абстрактный класс Shape с абстрактным методом double area() и методом void displayArea().
 */
public abstract class Shape {
    public abstract double area();

    public void displayArea(){
        System.out.println("Площадь: " + area());
    }
}
