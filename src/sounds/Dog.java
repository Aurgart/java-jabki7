package sounds;

/*
Собака
 */
public class Dog implements SoundEmitter {
    /**
     * Гав гав
     */
    @Override
    public void makeSound() {
        System.out.println("Собака говорит: гав!");
    }
}
