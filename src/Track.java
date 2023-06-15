public class Track implements Transport{
    int speed;
    String mark;
    Track(){
        int speed = 0;
    }

    @Override
    public void go() {
        speed = 90;
    }
}
