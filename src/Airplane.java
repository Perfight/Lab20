public class Airplane implements Transport {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    private String mark;

    Airplane() {
        speed = 0;
    }
    @Override
    public void go() {
        speed = 200;
    }
}
