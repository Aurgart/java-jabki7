package Sounds;
/*
Гудок
 */
public class CarHorn implements SoundEmitter{
    @Override
    public void makeSound() {
        System.out.println("Хорош сигналить чудила!");
    }
}
