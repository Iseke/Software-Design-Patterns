public class Run {
    public static void main(String[] args){
        MainData mainData = new MainData();
        FirstBidder firstBidder = new FirstBidder(mainData);
        mainData.setMeasurements("Dooglas",1200,"Gun");
        mainData.setMeasurements("Thomas",1800,"Book");
        System.out.println(firstBidder.toString());
    }
}
