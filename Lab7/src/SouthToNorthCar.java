public class SouthToNorthCar implements NorthCar {
    SouthCar southCar;
    public SouthToNorthCar(SouthCar southCar){
        this.southCar = southCar;
    }

    @Override
    public void AirConditioner() {
        southCar.AirConditioner();
    }

    @Override
    public void Wheels() {
        southCar.Wheels();
    }
}
