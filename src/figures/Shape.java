package figures;
/*
Создайте абстрактный класс Shape с абстрактным методом double area() и методом void displayArea().
 */
public abstract class Shape {
    /**
     * Площадь
     * @return - площадь фигуры.
     */
    public abstract double area();

    /**
     * Отображение площади.
     */
    public void displayArea(){
        System.out.println("Площадь: " + area());
    }
}
