public class Primary extends Main{
    public Primary(){
        transportWay = new Bus();
        sportSection = new CantDoSport();
    }

    @Override
    public void display() {
        System.out.println("I'm a Primary school student!");
    }
}
