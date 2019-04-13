//Receiver
public class Chef {
    public void StartCook(){
        System.out.println("Start cooking firm dish!!!");
        try {

            Thread.sleep(2000);     //2000-задержка  на 2000 миллисекунду = 2 секунда

        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Dish is ready!!!");
    }
    public void StopCooking(){
        System.out.println("Stop cooking!!!");
    }
}
