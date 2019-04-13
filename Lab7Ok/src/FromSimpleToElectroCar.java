public class FromSimpleToElectroCar implements ElectroCar {
    SimpleCar simpleCar;
    public FromSimpleToElectroCar(SimpleCar simpleCar){
        this.simpleCar=simpleCar;
    }

    @Override
    public void Motor() {
        simpleCar
    }

    @Override
    public void Stop() {

    }
}
