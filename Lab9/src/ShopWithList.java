import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShopWithList {
    private List<String> products = new ArrayList<>();
    private ListIterator<String> it = null;
    public ShopWithList(List<String> products){
        this.products = products;
    }
    public void getProducts(){
        it = products.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
