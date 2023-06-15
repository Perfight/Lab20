public class Ship implements Transport {
    private int speed;
    private int mark;

    @Override
    public void go() {
        speed = 50;
    }
}
