public class CarWithICE implements SimpleCar { //ICE - internal combustion engine
    @Override
    public void Transmission() {
        System.out.println("Use 6-auto transmissions ");
    }

    @Override
    public void moveWith() {
        System.out.println("Use oil AI-98");
    }

    @Override
    public void stop() {
        System.out.println("Motor off!!!");
    }
}
