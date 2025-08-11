import figures.Circle;
import figures.Rectangle;
import figures.Shape;
import filesystem.File;
import filesystem.ImageFile;
import filesystem.TextFile;
import sounds.AlarmClock;
import sounds.CarHorn;
import sounds.Dog;
import sounds.SoundEmitter;
import transport.Transport;
import transport.Bicycle;
import transport.Airplane;
import org.junit.jupiter.api.Test;

/*
Самостоятельная работа:
1. Фигуры
Cоздайте массив Shape[], заполните его экземплярами и вызовите displayArea() для каждого элемента (полиморфизм).

2. Звуки
Создайте метод playAllSounds(SoundEmitter[] devices), который вызывает makeSound() у каждого объекта.
Покажите преимущества интерфейсов.

3. Файловая система
Реализуйте метод getSize() в каждом классе.
Напишите метод, который считает общий размер всех файлов в массиве File[].

4. Транспорт
В каждом классе реализуйте move() с описанием движения.
Создайте метод startRace(Transport[] vehicles), который вызывает move().
 */
class MainTest {
    @Test
    public void testShape() {
        Shape[] shapes = {new Circle(5.5), new Rectangle(6, 9.8), new Circle(10)};
        for (Shape shp : shapes) {
            shp.displayArea();
        }
    }

    /**
     * Играет все звуки из массива.
     *
     * @param devices
     */
    public void playAllSounds(SoundEmitter[] devices) {
        for (SoundEmitter se : devices) {
            se.makeSound();
        }
    }

    @Test
    public void testSounds() {
        SoundEmitter[] semitter = {new Dog(), new CarHorn(), new AlarmClock(), new Dog()};
        playAllSounds(semitter);
    }

    /**
     * Получение размера всех файлов
     *
     * @param files
     * @return
     */
    public int getAllFileSize(File[] files) {
        int fullSize = 0;
        for (File f : files) {
            fullSize += f.getSize();
        }
        return fullSize;
    }

    @Test
    public void testFiles() {
        File[] files = {new TextFile("Победа будет за нами"), new TextFile("Истинная вера спасает душу"), new ImageFile(1200, 780, 10)};
        System.out.println("Размер всех файлов в байтах: " + getAllFileSize(files));
    }

    /**
     * Запуск гонки.
     *
     * @param vehicles
     */
    public void startRace(Transport[] vehicles) {
        for (Transport car : vehicles) {
            car.move();
        }
    }

    @Test
    public void testTransport() {
        Transport[] cars = {new Bicycle(40), new Airplane(600), new Bicycle(20), new Airplane(900)};
        startRace(cars);
    }
}