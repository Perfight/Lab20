public class TrackFactory extends TransportFactory {

    @Override
    public Transport createTransport(){
        return new Track();
    }
}

