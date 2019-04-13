public class EagerConverter {
    /*---Private Constructor helps to prevent to create an instance of this class---*/
    private EagerConverter(){}

    /* Create instance when class loading*/
    private static final EagerConverter converter = new EagerConverter();

    /*Provide global access */
    public static EagerConverter getConverter(){
        return  converter;
    }
    public double convertTengeToManat(double cur){
        return (cur/220.8);
    }
    public double convertManatToTenge(double cur){
        return (cur*220.8);
    }
}
