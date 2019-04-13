public class EagerBlockConverter {
    private static final EagerBlockConverter converter;

    /*---Private Constructor helps to prevent to create an instance of this class---*/
    private EagerBlockConverter(){}

    /*Create only one instance in this static block*/
    static {
        try{
            converter = new EagerBlockConverter();
        }catch (Exception e){
            throw  e;
        }
    }
    /*Provide global method to get an instance*/
    public static  EagerBlockConverter getConverter(){
        return converter;
    }
    public double convertTengeToManat(double cur){
        return (cur/220.8);
    }
    public double convertManatToTenge(double cur){
        return (cur*220.8);
    }

}
