public class TeslaCar implements ElectroCar {
    @Override
    public void moveWith() {
        System.out.println("Use electricity ");
    }


    @Override
    public void stop() {
        System.out.println("Car off!!!");
    }
}
