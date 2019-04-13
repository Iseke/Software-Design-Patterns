public class Neapolitan extends Pizza{
    public Neapolitan(){
        description = "Neapolitan pizza";
    }

    @Override
    public double cost() {
        return 6.99;
    }
}
