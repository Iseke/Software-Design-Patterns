public class Bagel extends Pizza {
    public Bagel(){
        description = "Bagel pizza";
    }

    @Override
    public double cost() {
        return 5.99;
    }
}
