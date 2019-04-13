public class DrivingModes {
    Transmission transmission;
    ShockAbsorber shockAbsorber;
    Motor motor;
    Wheels wheels;
    DriveUnit driveUnit;
    public DrivingModes(DriveUnit driveUnit,Wheels wheels,Transmission transmission, ShockAbsorber shockAbsorber,Motor motor){
        this.transmission = transmission;
        this.driveUnit= driveUnit;
        this.wheels = wheels;
        this.motor = motor;
        this.shockAbsorber = shockAbsorber;
    }
    public void SportMode(){
        transmission.FastChange();
        motor.OverPower();
        shockAbsorber.Hard();
    }
    public void CityMode(){
        transmission.NormalChange();
        shockAbsorber.Soft();
        motor.HalfPower();
        driveUnit.FWD();
    }
    public void OffRoadMode(){
        transmission.LowGears();
        motor.FullPower();
        shockAbsorber.Hard();
        driveUnit.AWD();
    }
}
