package sounds;
/*
Будильник
 */
public class AlarmClock implements SoundEmitter {
    /**
     * Воспроизведение звука.
     */
    @Override
    public void makeSound() {
        System.out.println("Еще 5 минуточек");
    }
}
