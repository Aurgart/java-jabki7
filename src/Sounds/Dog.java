package Sounds;
/*
Собака
 */
public class Dog implements SoundEmitter{
    @Override
    public void makeSound() {
        System.out.println("Собака говорит: гав!");
    }
}
