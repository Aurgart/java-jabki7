package Sounds;
/*
Будильник
 */
public class AlarmClock implements  SoundEmitter{
    @Override
    public void makeSound() {
        System.out.println("Еще 5 минуточек");
    }
}
