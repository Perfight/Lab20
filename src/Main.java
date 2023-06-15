public class Main {
    public static void main(String[] args) {
        TrackFactory Lada_Factory = new TrackFactory();
        Track track = (Track) Lada_Factory.createTransport();
        track.mark = "Largus";
        AirplaneFactory airplane_Factory = new AirplaneFactory();
        Airplane airplane = ((Airplane) airplane_Factory.createTransport());
        airplane.setMark("BOING");
        ShipFactory shipFactory = new ShipFactory();
        Ship Avrora = (Ship) shipFactory.createTransport();
    }
}
