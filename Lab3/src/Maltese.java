public class Maltese extends Pizza{
    public Maltese(){
        description = "Maltese pizza";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
