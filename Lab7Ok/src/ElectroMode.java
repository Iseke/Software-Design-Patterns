public class ElectroMode implements ElectroCar {
    Battery battery;
    ElectroMotor electroMotor;
    public ElectroMode(Battery b , ElectroMotor e){
        battery = b;
        electroMotor = e;
    }
    @Override
    public void Motor() {
        electroMotor.HighKLW();
        battery.HighAmount();
    }

    @Override
    public void Stop() {
        electroMotor.Stop();
    }
}
