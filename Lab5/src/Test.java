public class Test {
    public static void main(String[] args){
        CurrencyConverter converter = CurrencyConverter.getConverter();
        System.out.println(converter.convertManatToTenge(150));
    }
}
