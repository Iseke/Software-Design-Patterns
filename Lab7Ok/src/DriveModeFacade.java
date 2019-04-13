public class DriveModeFacade implements SimpleCar {
    Motor motor;
    Transmission transmission;
    public DriveModeFacade(Motor m , Transmission t){
        motor=m;
        transmission=t;
    }

    @Override
    public void SportMode() {
        motor.FullPower();
        transmission.FastChange();
    }

    @Override
    public void off() {
        motor.Stop();
    }
}
