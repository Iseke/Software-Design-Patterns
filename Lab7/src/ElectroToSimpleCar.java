public class ElectroToSimpleCar implements  SimpleCar {
    ElectroCar electroCar;
    public ElectroToSimpleCar(ElectroCar electroCar){
        this.electroCar = electroCar;
    }
    @Override
    public void moveWith() {
        electroCar.moveWith();
    }

    @Override
    public void Transmission() {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void stop() {
        electroCar.stop();
    }
}
