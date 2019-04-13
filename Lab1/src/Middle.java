public class Middle extends  Main{
    public Middle(){
        transportWay = new Train();
        sportSection  = new CanTake2Sport();
    }

    @Override
    public void display() {
        System.out.println("I'm a Middle school student!");
    }
}
