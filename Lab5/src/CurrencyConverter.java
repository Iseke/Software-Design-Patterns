public class CurrencyConverter {

    private  static CurrencyConverter converter ;

    /*---Private Constructor helps to prevent to create an instance of this class---*/
    private CurrencyConverter(){}

    /*Create instance when is accessed first time*/
    public static synchronized CurrencyConverter getConverter(){ //--keyword "synchronized helps us to provide only one Thread enter at the same time"
        if(converter == null){
            converter = new CurrencyConverter();
        }
        return converter;
    }
    public double convertTengeToManat(double cur){
        return (cur/220.8);
    }
    public double convertManatToTenge(double cur){
        return (cur*220.8);
    }
}
