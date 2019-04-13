public class DoubleCheckedConverter {
    //--Keyword volatile line "synchronized" helps us to make the class thread safe
    //Thread safety means that a method or class can be used by multiple threads at the same time without problems.
    private static  volatile  DoubleCheckedConverter converter;

    /*---Private Constructor helps to prevent to create an instance of this class---*/
    private DoubleCheckedConverter(){}

    /*Initialize class in a synchronized block*/
    public static DoubleCheckedConverter getConverter(){
        if(converter==null){
            synchronized (DoubleCheckedConverter.class){
                /*double check*/
                if(converter == null){
                    converter = new DoubleCheckedConverter();
                }
            }
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

//I thin k
