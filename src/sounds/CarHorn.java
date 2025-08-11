package sounds;

/*
Гудок
 */
public class CarHorn implements SoundEmitter {
    /**
     * Сигнал машины
     */
    @Override
    public void makeSound() {
        System.out.println("Хорош сигналить чудила!");
    }
}
