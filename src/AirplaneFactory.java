public class AirplaneFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
