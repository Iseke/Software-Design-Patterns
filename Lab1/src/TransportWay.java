import org.omg.CORBA.TRANSACTION_MODE;

public interface TransportWay {
    public void use();
}
class Bus implements TransportWay{
    @Override
    public void use() {
        System.out.println("I use only Bus!");
    }
}
class Train implements TransportWay{
    @Override
    public void use() {
        System.out.println("I can use train!");
    }
}
class Taxi implements TransportWay{
    @Override
    public void use() {
        System.out.println("I can use Taxi!");
    }
}