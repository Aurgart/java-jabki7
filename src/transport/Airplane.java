package transport;
/*
Самолет
 */
public class Airplane extends Transport{
    public Airplane(int speed) {
        this.speed = speed;
    }

    /**
     * движение.
     */
    @Override
    public void move() {
        System.out.println("Самолет летит со скоростью: " + this.speed + " км в час!");
    }
}
