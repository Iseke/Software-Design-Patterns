import java.util.*;

public class ShopWithHashMap {
    private HashMap<Date, String> hashMap = new HashMap<>();
    private int coutnt = 0;
    private long first,last;
    private Set enryset;
    private Iterator it;
    public ShopWithHashMap(){
        first = System.currentTimeMillis();
        add();

    }
    public void printMilks(){
        enryset = hashMap.entrySet();
        it = enryset.iterator();
        while (it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey()+"   "+me.getValue());
        }
    }
    public void add(){
        String name = "Milk"+coutnt;
        try {
            last = System.currentTimeMillis();
            hashMap.put(new Date(),name);
            Thread.sleep(2000);     //2000-задержка  на 2000 миллисекунду = 2 секунда

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        coutnt++;
    }
    public void ExpiryMilk(){
        if(last-first>100000){
            System.out.println(hashMap.get(0)+"  "+ hashMap.get(0));
        }else{
            System.out.println("Milks ok!!");
        }
    }
}
