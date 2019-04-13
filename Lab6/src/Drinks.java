//Receiver
public class Drinks {
    public void StartPour(){
        System.out.println("Choosing drink");
        try {

            Thread.sleep(1000);     //1000-задержка  на 1000 миллисекунду = 1 секунда

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Drink chosen");
        System.out.println("Pour drink");
    }
    public void RemoveDrink(){
        System.out.println("Remove drink");
    }
}
