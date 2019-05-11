import java.util.Iterator;
import java.util.TreeSet;

public class ShopWithTree {
    private TreeSet<Integer> treeSet = new TreeSet<>();
    private int price[];
    public ShopWithTree(int price[]){
        this.price = price;
    }
    public void printPrice(){
        for(int i=0;i<price.length;i++){
            treeSet.add(price[i]);
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void getLowPrice(){
        System.out.println("Low Price: "+treeSet.first());
    }
    public void getHighPrice(){
        System.out.println("HighPrice: "+treeSet.last());
    }
}
