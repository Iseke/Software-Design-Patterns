//Receiver
public class Dessert {
    public void Candy(){
        System.out.println("Choosing dessert");
        try {

            Thread.sleep(2000);     //2000-задержка  на 2000 миллисекунду = 2 секунда

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Cutting pie");
        System.out.println("Dessert is ready!!!");
    }
    public void RemCandy(){
        System.out.println("Dessert removed!!!");
    }
}
