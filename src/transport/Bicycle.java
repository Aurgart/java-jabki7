package transport;

/*
Велик
 */
public class Bicycle extends Transport {

    public Bicycle(int speed) {
        this.speed = speed;
    }

    /**
     * движение
     */
    @Override
    public void move() {
        System.out.println("Круча педали со всей силы, гонит со скоростью : " + this.speed + "км в час");
    }
}
