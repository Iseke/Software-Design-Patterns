import java.util.Observable;
import  java.util.Observer;

public class FirstBidder implements  Observer {
    Observable observable;
    private String author;
    private float price;
    private String name;
    public FirstBidder(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof MainData){
            MainData mainData = (MainData)o;
            this.name = mainData.getName();
            this.price = mainData.getPrice();
            this.author = mainData.getAuthor();
        }
    }
    public String toString(){
        return "Author: "+ author+"  price: "+price+" $  " + " name: "+name;
    }
}
