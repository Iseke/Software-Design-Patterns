import java.util.Observable;
public class MainData extends Observable{
    private String author;
    private float price;
    private String name;
    public MainData(){}
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(String author,float price, String name){
        this.author = author;
        this.price = price;
        this.name = name;
        measurementsChanged();
    }

    public String getAuthor() {
        return author;
    }
    public String getName(){
        return  name;
    }

    public float getPrice() {
        return price;
    }
}
