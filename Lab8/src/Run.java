public class Run {
    public static void main(String[] args){
        System.out.println("High-Rise house\n");
        HighRiseHouse HRh =new HighRiseHouse();
//        HRh.getInput();
        HRh.prepareToBuild();
        System.out.println("Country house\n");
        CountryHouse h = new CountryHouse();
        h.prepareToBuild();
    }
}
