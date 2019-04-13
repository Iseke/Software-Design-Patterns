public abstract class Main {
    TransportWay transportWay;
    SportSection sportSection;
    public Main(){

    }
    public abstract void display();
    public void transportType(){
        transportWay.use();
    }
    public void doingSport(){
        sportSection.doSport();
    }
    public void setTransportWay(TransportWay tr){
        transportWay = tr;
    }
    public void setSportSection(SportSection ss){
        sportSection = ss;
    }
}
