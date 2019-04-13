public class InnerClassConverter {
   /*---Private Constructor helps to prevent to create an instance of this class---*/
    private InnerClassConverter(){}

    /*This class is load when getConverter method is called , and crate new instance of class Converter*/
    private static class Helper{
        private static final InnerClassConverter CONVERTER = new InnerClassConverter();
    }

    /*This method load the Inner class, and called globally */
    public static InnerClassConverter getConverter(){
        return Helper.CONVERTER;
    }

    public double convertTengeToManat(double cur){
        return (cur/220.8);
    }
    public double convertManatToTenge(double cur){
        return (cur*220.8);
    }
}
