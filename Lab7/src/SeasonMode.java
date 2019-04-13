public class SeasonMode {
    AirConditioner airConditioner;
    Wheels wheels;
    Seat seat;
    DriveUnit driveUnit;
    Motor motor;
    public SeasonMode(AirConditioner a,Wheels w,Seat s, DriveUnit d,Motor m){
        airConditioner = a;
        wheels = w;
        seat = s;
        driveUnit = d;
        motor = m;
    }
    public void WinterMode(){
        airConditioner.Hot();
        wheels.Spikes();
        seat.Heating();
    }
    public void SummerVoid(){
        airConditioner.Cold();
        wheels.Rubber();
        seat.Ventilation();
    }
}
