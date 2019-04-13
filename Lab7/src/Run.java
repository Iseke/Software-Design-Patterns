public class Run {
    public static void main(String[] args){
        Wheels wheels = new Wheels();
        AirConditioner airConditioner = new AirConditioner();
        DriveUnit driveUnit= new DriveUnit();
        Motor motor = new Motor();
        Seat seat = new Seat();
        Transmission transmission = new Transmission();
        ShockAbsorber shockAbsorber = new ShockAbsorber();
        DrivingModes drivingModes = new DrivingModes(driveUnit,wheels,transmission,shockAbsorber,motor);
        drivingModes.OffRoadMode();
        SeasonMode seasonMode = new SeasonMode(airConditioner,wheels,seat,driveUnit,motor);
        seasonMode.SummerVoid();
        TeslaCar teslaCar = new TeslaCar();
        CarWithICE carWithICE = new CarWithICE();
        SimpleCar electroAdapter = new ElectroToSimpleCar(teslaCar);
        System.out.println("ELECTRO**********");
        teslaCar.moveWith();
        teslaCar.stop();
        System.out.println("SIMPLE**********");
        carWithICE.moveWith();
        carWithICE.Transmission();
        carWithICE.stop();
        System.out.println("ELECTRO___ADAPTER**********");
        electroAdapter.moveWith();
        electroAdapter.Transmission();
        electroAdapter.stop();
        NorthType northType = new NorthType();
        SouthType southType = new SouthType();
        NorthCar adapter = new SouthToNorthCar(southType);



    }
}
