public class High extends  Main{
    public High(){
        transportWay = new Taxi();
        sportSection = new CanTake4Sport();
    }

    @Override
    public void display() {
        System.out.println("I'm a High school student!");
    }
}
